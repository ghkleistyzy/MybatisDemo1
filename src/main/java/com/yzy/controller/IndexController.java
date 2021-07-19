package com.yzy.controller;

import com.alibaba.fastjson.JSON;
import com.yzy.service.CartService;
import com.yzy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Set;

@Controller
public class IndexController {

    @Autowired
    CartService cartService;

    @Autowired
    ProductService productService;

    @RequestMapping("/")
    public String helloDemo() {
        return "test";
    }

    @RequestMapping("/queryCart")
    public String queryCart(@RequestParam("uid") Integer uid, Model model) {
        model.addAttribute("cart", cartService.findAllByUserId(uid));
        return "index";

    }

    @RequestMapping("/deleteProduct")
    public String deleteUser(@RequestParam("cid") Integer cid, @RequestParam("uid") Integer uid) {
        cartService.deletePoductById(cid);
        return "redirect:/queryCart?uid=" + uid + "";

    }

    @RequestMapping("/placecart")
    @ResponseBody
    public void showCartPrice(HttpServletRequest request) {
        String selectedProductMap = request.getParameter("selectedProductMap");
        HashMap hashMap = JSON.parseObject(selectedProductMap, HashMap.class);
        Set set = hashMap.keySet();
        for (Object key : set) {
            cartService.deletePoductById(Integer.valueOf((String) key));
            productService.updateProductById(Integer.valueOf((String) key), Integer.valueOf((String) hashMap.get(key)));
        }

//        return "redirect:/queryCart?uid=1";

    }
}

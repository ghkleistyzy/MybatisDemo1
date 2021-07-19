package com.yzy.controller;

import com.yzy.entity.Cart;
import com.yzy.entity.Product;
import com.yzy.service.CartService;
import com.yzy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    CartService cartService;

    @RequestMapping("/queryAllProduct")
    public String findAllProduct(Model model) {
        List<Product> allProduct = productService.findAllProduct();
        model.addAttribute("product", allProduct);
        return "product";
    }

    @RequestMapping("/addProduct")
    @ResponseBody
    public void addProduct(HttpServletRequest request) {
        String pid = request.getParameter("productId");
        String pquantity = request.getParameter("pquantity");
        productService.updateProductById(Integer.valueOf(pid), Integer.valueOf(pquantity));
        if (cartService.findProductById(Integer.valueOf(pid)) == false) {
            Product product = productService.selectProductById(Integer.valueOf(pid));
            Cart cart = new Cart();
            cart.setCid(Integer.valueOf(pid));
            cart.setCname(product.getPname());
            cart.setCprice(product.getPprice());
            cart.setCquantity(Integer.valueOf(pquantity));
            cart.setUid(3);
            cartService.addProductById(cart);
        } else {
            cartService.updateCartById(Integer.valueOf(pid), Integer.valueOf(pquantity));
        }
    }
}

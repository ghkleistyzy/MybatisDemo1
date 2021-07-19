package com.yzy.service.Impl;

import com.yzy.entity.Cart;
import com.yzy.mapper.CartMapper;
import com.yzy.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {


    @Autowired
    CartMapper cartMapper;



    @Override
    public List<Cart> findAllByUserId(Integer uid) {
        return cartMapper.findAllByUserId(uid);
    }

    @Override
    public int deletePoductById(Integer cid) {
        return cartMapper.deletePoductById(cid);
    }

    @Override
    public int addProductById(Cart cart) {
        return cartMapper.addProductById(cart);
    }

    @Override
    public boolean findProductById(Integer cid) {
        List<Cart> productById = cartMapper.findProductById(cid);
        if (productById!=null){
            return true;
        }
        return false;
    }

    @Override
    public int updateCartById(Integer cid,Integer cquantity) {
        return cartMapper.updateCartById(cid,cquantity);
    }
}

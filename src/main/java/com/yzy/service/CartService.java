package com.yzy.service;

import com.yzy.entity.Cart;

import java.util.List;

public interface CartService {

    List<Cart> findAllByUserId(Integer uid);

    int deletePoductById(Integer cid);

    int addProductById(Cart cart);

    boolean  findProductById(Integer cid);

    int updateCartById(Integer cid,Integer cquantity);
}

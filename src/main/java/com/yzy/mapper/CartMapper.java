package com.yzy.mapper;

import com.yzy.entity.Cart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {
    List<Cart> findAllByUserId(Integer uid);

    int deletePoductById(Integer cid);

    int addProductById(Cart cart);

    List<Cart>  findProductById(Integer cid);

    int updateCartById(Integer cid,Integer cquantity);
}

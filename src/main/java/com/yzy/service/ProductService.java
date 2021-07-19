package com.yzy.service;

import com.yzy.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProduct();

    int updateProductById(Integer pid,Integer pquantity);

    Product selectProductById(Integer pid);
}

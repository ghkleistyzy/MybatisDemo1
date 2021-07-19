package com.yzy.service.Impl;

import com.yzy.entity.Product;
import com.yzy.mapper.ProductMapper;
import com.yzy.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> findAllProduct() {
        return productMapper.findAllProduct();
    }

    @Override
    public int updateProductById(Integer pid,Integer pquantity) {
        return productMapper.updateProductById(pid,pquantity);
    }

    @Override
    public Product selectProductById(Integer pid) {
        return productMapper.selectProductById(pid);
    }
}

package com.yzy.mapper;

import com.yzy.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    List<Product> findAllProduct();

    int updateProductById(Integer pid,Integer pquantity);

    Product selectProductById(Integer pid);
}

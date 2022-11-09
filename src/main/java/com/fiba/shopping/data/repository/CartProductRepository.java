package com.fiba.shopping.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.fiba.shopping.data.entity.CartProduct;

public interface CartProductRepository extends CrudRepository<CartProduct,Long>{

}

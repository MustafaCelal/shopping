package com.fiba.shopping.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.fiba.shopping.data.entity.Cart;

public interface CartRepository extends CrudRepository<Cart,Long>{

}

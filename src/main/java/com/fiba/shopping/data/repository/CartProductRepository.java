package com.fiba.shopping.data.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.fiba.shopping.data.entity.CartProduct;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CartProductRepository extends CrudRepository<CartProduct,Long>{

    @Modifying
    @Transactional
    @Query("DELETE from CartProduct cp where cp.cart.cartId = :cartId and cp.productId = :productId")
    void deleteProduct(@Param("cartId") long cartId, @Param("productId") long productId);

}

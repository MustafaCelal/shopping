package com.fiba.shopping.data.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import com.fiba.shopping.data.entity.Cart;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CartRepository extends CrudRepository<Cart,Long>{
    @Modifying
    @Transactional
    @Query("UPDATE Cart c SET c.cartStatus = CASE c.cartStatus WHEN TRUE THEN FALSE ELSE TRUE END WHERE c.cartId = :cartId")
    void checkoutCart(@Param("cartId") long cartId);
}

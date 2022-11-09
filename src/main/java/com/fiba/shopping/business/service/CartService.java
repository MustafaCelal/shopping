package com.fiba.shopping.business.service;

public interface CartService {

	long create();

	void checkoutCart(long cartId);
}

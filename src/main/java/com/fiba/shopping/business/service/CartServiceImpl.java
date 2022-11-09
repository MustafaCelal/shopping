package com.fiba.shopping.business.service;

import org.springframework.stereotype.Service;

import com.fiba.shopping.data.entity.Cart;
import com.fiba.shopping.data.repository.CartRepository;

@Service
public class CartServiceImpl implements CartService{

	private CartRepository cartRepository;
	
	CartServiceImpl(CartRepository cartRepository){
		this.cartRepository=cartRepository;
	}
	
	@Override
	public long create() {
		
		return cartRepository.save(new Cart()).getCartId();
	}
	
}

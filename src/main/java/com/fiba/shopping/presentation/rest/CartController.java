package com.fiba.shopping.presentation.rest;

import org.springframework.web.bind.annotation.*;

import com.fiba.shopping.business.dto.CartProductDto;
import com.fiba.shopping.business.service.CartProductService;
import com.fiba.shopping.business.service.CartService;

@RestController
public class CartController {

	private CartService cartService;
	private CartProductService cartProductService;
	
	CartController(CartService cartService, CartProductService cartProductService){
		this.cartService=cartService;
		this.cartProductService=cartProductService;
	}
	
	@GetMapping("/shopping/cart/create")
	public long createCart() {
		return cartService.create();
	}

	@PostMapping("/shopping/cart/add")
	public void addToCart(@RequestBody CartProductDto cartProductDto) {
		cartProductService.add(cartProductDto);
	}

	@GetMapping("/shopping/checkout/{cartId}")
	public void checkoutCart(@PathVariable("cartId") long cartId) {
		cartService.checkoutCart(cartId);
	}


}

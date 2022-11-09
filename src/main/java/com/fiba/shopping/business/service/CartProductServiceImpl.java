package com.fiba.shopping.business.service;

import com.fiba.shopping.data.entity.Cart;
import com.fiba.shopping.data.entity.CartProduct;
import com.fiba.shopping.data.repository.CartProductRepository;
import org.springframework.stereotype.Service;

import com.fiba.shopping.business.dto.CartProductDto;

@Service
public class CartProductServiceImpl implements CartProductService{


	CartProductRepository cartProductRepository;

	CartProductServiceImpl(CartProductRepository cartProductRepository){
		this.cartProductRepository = cartProductRepository;
	}

	@Override
	public void add(CartProductDto cartProductDto) {
		CartProduct cartProduct=new CartProduct();

		cartProduct.setProductId(cartProductDto.getProductId());
		cartProduct.setLineAmount(cartProductDto.getLineAmount());
		cartProduct.setSalesPrice(cartProductDto.getSalesPrice());
		cartProduct.setSalesQuantity(cartProductDto.getSalesQuantity());

		cartProduct.setCart(new Cart());
		cartProduct.getCart().setCartId(cartProductDto.getCartId());

		cartProductRepository.save(cartProduct);
	}

	@Override
	public void deleteProduct(long cartId, long productId) {
		cartProductRepository.deleteProduct(cartId, productId);
	}
}

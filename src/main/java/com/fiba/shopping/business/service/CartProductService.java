package com.fiba.shopping.business.service;

import com.fiba.shopping.business.dto.CartProductDto;

public interface CartProductService {

	void add(CartProductDto cartProductDto);
	void deleteProduct(long cartId,long productId);
}

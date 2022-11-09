package com.fiba.shopping.business.dto;

import java.util.List;

import com.fiba.shopping.data.entity.CartProduct;

public class CartDto {

	private long cartId;
	
	private String customerName;
	
	private double totalAmount;
	
	private boolean cartStatus;
	
	private List<CartProductDto> cartProductDtos;
	
	public CartDto() {
	}

	public CartDto(long cartId, String customerName, double totalAmount, boolean cartStatus) {
		this.cartId = cartId;
		this.customerName = customerName;
		this.totalAmount = totalAmount;
		this.cartStatus = cartStatus;
	}

	public long getCartId() {
		return cartId;
	}

	public void setCartId(long cartId) {
		this.cartId = cartId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public boolean isCartStatus() {
		return cartStatus;
	}

	public void setCartStatus(boolean cartStatus) {
		this.cartStatus = cartStatus;
	}

	public List<CartProductDto> getCartProducts() {
		return cartProductDtos;
	}

	public void setCartProducts(List<CartProductDto> cartProductDtos) {
		this.cartProductDtos = cartProductDtos;
	} 
	
}

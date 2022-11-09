package com.fiba.shopping.data.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cart {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long cartId;
	
	private String customerName;
	
	private double totalAmount;
	
	//(O:Yeni 1: Bitmis)
	private boolean cartStatus;
	
	@OneToMany(mappedBy="cart",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	private List<CartProduct> cardProducts;
	
	public Cart() {
	}

	public Cart(long cartId, String customerName, double totalAmount, boolean cartStatus) {
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
	
	public List<CartProduct> getCardProducts() {
		return cardProducts;
	}

	public void setCardProducts(List<CartProduct> cardProducts) {
		this.cardProducts = cardProducts;
	}
}

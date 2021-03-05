package com.mgg;

public class UsedProduct extends Item {
	
	public Double basePrice;

	public UsedProduct(String code, String type, String name, Double basePrice) {
		super(code, type, name);
		this.basePrice = basePrice;
	}
	
	public Double getBasePrice() {
		return basePrice;
	}
	
	@Override
	public String getTypeName() {
		return "UsedProduct";
	}
	
	@Override
	public Double getCost() {
		return (this.basePrice * .8) + (this.basePrice * 0.0725);
	}
	
}
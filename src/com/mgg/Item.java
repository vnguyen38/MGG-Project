package com.mgg;

public abstract class Item {
	
	private String code;
	private static String type;
	private String name;
	protected String typeName;
	protected Double cost;

	public Item(String code, String type, String name) {
		this.code = code;
		this.type = type;
		this.name = name;
	}

	public String getCode() {
		return code;
	}
	
	public static String getType() {
		return type;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract String getTypeName();
	
	public abstract Double getCost();
	
}
package com.beercafeguy.workshop.ds.adt;

public class Photograph implements Sellable {

	private String description;
	private int price;
	private boolean color;
	
	
	public Photograph(String description, int price, boolean color) {
		super();
		this.description = description;
		this.price = price;
		this.color = color;
	}

	public String description() {
		return description;
	}

	public int listPrice() {
		return price;
	}

	public int lowestPrice() {
		// TODO Auto-generated method stub
		return price/2;
	}
	
	public boolean isColor(){
		return color;
	}

}

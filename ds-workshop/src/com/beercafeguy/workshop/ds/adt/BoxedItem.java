package com.beercafeguy.workshop.ds.adt;

public class BoxedItem implements Transportable, Sellable {
	
	private String description;
	private int price;
	private int weight;
	private boolean haz;
	private int height=0;
	private int width=0;
	private int depth=0;
	
	

	public BoxedItem(String description, int price, int weight, boolean haz) {
		super();
		this.description = description;
		this.price = price;
		this.weight = weight;
		this.haz = haz;
	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return description;
	}

	@Override
	public int listPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public int lowestPrice() {
		// TODO Auto-generated method stub
		return price/2;
	}

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public boolean isHazardous() {
		// TODO Auto-generated method stub
		return haz;
	}

}

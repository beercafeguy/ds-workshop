package com.beercafeguy.workshop.ds;

public class GeometricProgression extends Progression{

	protected long base;
	public GeometricProgression(){
		this(2,1);
	}
	
	public GeometricProgression(long base){
		this(base,1);
	}
	
	public GeometricProgression(long base,long start){
		super(start);
		this.base=base;
	}
	
	protected void advance(){
		//System.out.println("Child class advance called");
		super.current*=base;
	}
	
}

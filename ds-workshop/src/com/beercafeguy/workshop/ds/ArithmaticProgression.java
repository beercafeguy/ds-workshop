package com.beercafeguy.workshop.ds;

public class ArithmaticProgression extends Progression{

	protected long increment;
	public ArithmaticProgression(){
		this(1,0);
	}
	
	public ArithmaticProgression(long stepSize){
		this(stepSize,0);
	}
	
	public ArithmaticProgression(long stepSize,long start){
		super(start);
		increment=stepSize;
	}
	
	protected void advance(){
		//System.out.println("Child class advance called");
		super.current+=increment;
	}
	
}

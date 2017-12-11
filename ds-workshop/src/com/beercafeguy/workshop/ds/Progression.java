package com.beercafeguy.workshop.ds;

public class Progression {

	protected long current;
	public Progression(){
		this(0);
	}
	
	public Progression(long start){
		current=start;
	}
	
	public long nextValue(){
		long ans=current;
		//System.out.println("Ans:"+ans);
		//System.out.println("Current:"+current);
		advance();
		//System.out.println("Ans:"+ans);
		//System.out.println("Current:"+current);
		return ans;
	}

	protected void advance() {
		current++;
	}
	
	public void printProgression(int n){
		System.out.print(nextValue());//print first value without space
		for(int i=1;i<n;i++){
			System.out.print(" "+nextValue());
		}
		System.out.println();
	}
}

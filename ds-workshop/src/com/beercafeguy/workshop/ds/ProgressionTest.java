package com.beercafeguy.workshop.ds;

public class ProgressionTest {

	public static void main(String[] args) {
		//Progression progression=new Progression();
		
		Progression progression=new ArithmaticProgression(10,5);
		Progression gProgression=new GeometricProgression(2,5);
		Progression fProgression=new FibonacciProgression(2,5);
		progression.printProgression(10);
		gProgression.printProgression(10);
		fProgression.printProgression(10);
	}

}

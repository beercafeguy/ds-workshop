package com.beercafeguy.workshop.ds.arr;

public class ScoreBoard {

	private int numEntries=0;
	private GameEntry[] entries;
	public ScoreBoard(int size) {
		super();
		entries=new GameEntry[size];
	}
	
	public void add(GameEntry gameEntry){
		int newScore=gameEntry.getScore();
		if(numEntries<entries.length||newScore>entries[numEntries-1].getScore()){
			if(numEntries<entries.length){
				numEntries++;
			}
		}
	}
	
}

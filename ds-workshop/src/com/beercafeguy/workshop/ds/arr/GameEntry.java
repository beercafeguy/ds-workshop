package com.beercafeguy.workshop.ds.arr;

public class GameEntry {

	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "GameEntry [name=" + name + ", score=" + score + "]";
	}
	public GameEntry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GameEntry(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
}

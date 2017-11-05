package com.murilo.model;

public class Fruit {

	private final String name;
	
	public Fruit(final String name) {
		this.name = name;
	}
	
	public String getFruitName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		
		return "\nFruit: " + " \tName: " + this.name;
	}
}

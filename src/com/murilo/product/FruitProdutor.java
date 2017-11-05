package com.murilo.product;

import com.murilo.model.Fruit;

public class FruitProdutor implements Runnable {

	@Override
	public void run() {
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("Produzindo frutas...");
			FruitProcessor.fruits.add(new Fruit("Strawberry type " + 1));
		}
	}

}

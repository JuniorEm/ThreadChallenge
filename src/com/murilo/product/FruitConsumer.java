package com.murilo.product;

import java.util.Iterator;

import com.murilo.model.Fruit;

public class FruitConsumer implements Runnable {

	@Override
	public void run() {
		
		if (FruitProcessor.fruits.size() > 10) {

			if (FruitProcessor.fruits.isEmpty()) {
				throw new RuntimeException("It cannot be empty");
			}

			final Iterator<Fruit> iterator = FruitProcessor.fruits.iterator();
			while (iterator.hasNext()) {
				System.out.println("Removendo frutas...");
				iterator.next();
				iterator.remove();
			}
		}
	}

}

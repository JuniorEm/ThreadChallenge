package com.murilo.product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.murilo.model.Fruit;

public class FruitProcessor {

	static List<Fruit> fruits = Collections.synchronizedList(new ArrayList<>());

	public void process() {
		final Thread produtor = new Thread(new FruitProdutor());
		final Thread consumer = new Thread(new FruitConsumer());

		try {
			
			for (int i = 0; i < 3; i++) {
				produtor.start();
				produtor.join();
				consumer.start();
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void print() {
		fruits.stream().forEach(System.out::println);
	}

	private void printListSize() {
		System.out.println(fruits.size());
	}
}

package fr.wcs.workshop;

import java.util.Random;

public class Tools {
	
	private Random rand;
	
	public Tools(int seed) {
		this.rand = new Random(seed);
	}

	public void sayHello() {
		System.out.println("Hello !");
	}
	
	public int generateRand() {
		return this.rand.nextInt(100);
	}
}

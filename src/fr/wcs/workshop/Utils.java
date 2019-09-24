package fr.wcs.workshop;

import java.util.Random;

public class Utils {
	
	private static Random rand = new Random();

	public static void sayHello() {
		System.out.println("Hello !");
	}
	
	public static int generateRand() {
		return Utils.rand.nextInt(100);
	}
}

package fr.wcs.workshop;

import java.util.Random;

/**
 * Classe comportant des méthodes utilitaires statiques. Cela veut dire que les
 * méthodes 'sayHello' et 'generateRand' <b>doivent</b> être accédées par le nom
 * de la classe comme suit : <br>
 * <br>
 * int number = <b>Utils</b>.generateRand(); <br>
 * <br>
 * La classe Utils n'a que des méthodes statiques, on ne fait donc jamais
 * d'instance de cette classe.
 */
public class Utils {

	private static Random rand = new Random();

	/**
	 * Méthode permettant de dire 'Hello !' dans la sortie console (== stdout ==
	 * sortie standard).
	 */
	public static void sayHello() {
		System.out.println("Hello !");
	}

	/**
	 * Méthode permettant de récupérer un nombre aléatoire entre 0 et 100.
	 * 
	 * @return int le nombre généré.
	 */
	public static int generateRand() {
		return Utils.rand.nextInt(100);
	}
}

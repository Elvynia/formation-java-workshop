package fr.wcs.workshop;

import java.util.Random;

/**
 * Classe comportant des méthodes utilitaires. Les méthodes 'sayHello' et
 * 'generateRand' sont liées à l'instance. Cela veut dire que ces méthodes ne
 * sont accessibles que par :<br>
 * <br>
 * Tools <b>variable</b> = new Tools();<br>
 * <b>variable</b>.sayHello() <br>
 * <br>
 * <b>variable</b> est un objet, une instance de la classe Tools.
 */
public class Tools {

	/**
	 * Membre de classe privé (uniquement accessible depuis ce fichier .java). Cet
	 * objet comporte un algorithme capable de générer des nombres aléatoires grâces
	 * à ces méthodes.
	 */
	private Random rand;

	/**
	 * Constructeur de la classe Tools.
	 * 
	 * @param seed la graine à partir de laquelle générer des nombres aléatoires.
	 */
	public Tools(int seed) {
		this.rand = new Random(seed);
	}

	/**
	 * Méthode permettant de dire 'Hello !' dans la sortie console (== stdout ==
	 * sortie standard).
	 */
	public void sayHello() {
		System.out.println("Hello !");
	}

	/**
	 * Méthode permettant de récupérer un nombre aléatoire entre 0 et 100.
	 * 
	 * @return int le nombre généré.
	 */
	public int generateRand() {
		return this.rand.nextInt(100);
	}
}

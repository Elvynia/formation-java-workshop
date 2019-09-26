package fr.wcs.workshop;

/**
 * Classe permettant de travailler les méthodes statiques et non statiques.
 */
public class Methods {

	/**
	 * Méthode de point d'entrée dans le programme Java.
	 * 
	 * @param toto les argument passés depuis le système au programme.
	 */
	public static void main(String[] toto) {
		// Déclaration + initialisation d'une variable locale.
		String message = null;
		// Accès statique à la méthode getWelcomeMessage() qui ne nécessite pas
		// d'appeler 'new'.
		message = Methods.getWelcomeMessage();
		System.out.println(message);

		// La variable methods1 est une instance de la classe Methods.
		Methods methods1 = new Methods();
		// Appel à la méthode d'instance de methods1.
		String otherMessage1 = methods1.getOtherMessage();
		System.out.println(otherMessage1);

		// La variable methods2 est une autre instance de la classe Methods.
		Methods methods2 = new Methods(10);
		// Appel à la méthode d'instance de methods2.
		String otherMessage2 = methods2.getOtherMessage();
		System.out.println(otherMessage2);
	}

	/**
	 * Méthode statique qui donne un message de bienvenue dans le programme.
	 * 
	 * @return String le message.
	 */
	public static String getWelcomeMessage() {
		return "Bienvenue dans le workshop";
	}

	/*
	 * On sépare toujours tout le code statique en premier dans la classe, ensuite
	 * les membres, constructeurs et méthodes liées à chaque instance.
	 */

	/**
	 * Membre privé (accessible que depuis ce fichier .java). Un membre permet de
	 * mémoriser une valeur du programme.
	 */
	private int test;

	/**
	 * Constructeur par défaut (aucun argument). Par défaut on choisi un valeur pour
	 * le membre test de 42.
	 */
	public Methods() {
		this.test = 42;
	}

	/**
	 * Constructeur avec argument pour donner une valeur de départ au membre test.
	 * 
	 * @param test la valeur initiale à donner au membre du même nom.
	 */
	public Methods(int test) {
		// Cette manière de faire : l'argument du constructeur a TOUJOURS
		// (convention...) le même nom que le membre correspondant.
		this.test = test;
	}

	/**
	 * Méthode liée à chaque instance de la classe Methods. Cette méthode donne un
	 * message utilisant le membre test. Pour chaque instance de la classe Methods,
	 * la valeur du membre test peut être différente.
	 * 
	 * @return String le message.
	 */
	public String getOtherMessage() {
		return "Autre message n°" + this.test;
	}
}

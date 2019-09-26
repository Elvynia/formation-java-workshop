package fr.wcs.workshop;

/**
 * Classe permettant de démontrer les différences d'utilisations entre les
 * classes Tools et Utils.
 */
public class Principal {

	/**
	 * Méthode de point d'entrée dans le programme Java.
	 * 
	 * @param args les argument passés depuis le système au programme.
	 */
	public static void main(String[] args) {
		// Une première instance de Tools pour appeler ses méthodes.
		System.out.println("Instance myTools :\n");
		Tools myTools = new Tools(15);
		myTools.sayHello();
		System.out.println("Nombres aléatoires de myTools avec la seed 15 : " + myTools.generateRand() + ", "
				+ myTools.generateRand() + ", " + myTools.generateRand());
		

		// Une autre instance de Tools pour appeler ses méthodes.
		System.out.println("Instance otherTools :\n");
		Tools otherTools = new Tools(255);
		otherTools.sayHello();
		System.out.println("Nombres aléatoires de otherTools avec la seed 255 : " + otherTools.generateRand() + ", "
				+ otherTools.generateRand() + ", " + otherTools.generateRand());

		// Utilisation de Utils.
		System.out.println("Classe Utils (accès statique) :\n");
		Utils.sayHello();
		System.out.println("Nombres aléatoires de Utils sans seed : " + otherTools.generateRand() + ", "
				+ otherTools.generateRand() + ", " + otherTools.generateRand());
	}
}

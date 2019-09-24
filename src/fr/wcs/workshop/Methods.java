package fr.wcs.workshop;

public class Methods {

	public static void main(String[] toto) {
		String message = null;
		message = Methods.getWelcomeMessage();
		System.out.println(message);
		
		Methods methods = new Methods();
		String otherMessage = methods.getOtherMessage();
		System.out.println(methods.test);
		System.out.println(otherMessage);
	}
	
	public static String getWelcomeMessage() {
		return "Bienvenue dans le workshop";
	}
	
	private int test;
	
	public Methods() {
		this.test = 42;
	}
	
	public String getOtherMessage() {
		return "Autre message";
	}
}

package BaseJava;

import java.util.ArrayList;

public class Bibliotheque {

	private ArrayList<Livre> listlivres = new ArrayList<Livre>();

	/*
	 * Je parcours la liste des livres afin d'affecter le code
	 * 
	 * 
	 * 
	 */
	public void AffecterCode() {
		for (Livre livre : listlivres) {
			livre.ConstruireCode(); // Chaque livre a une function ConstruireCode qui permet de reconstruire le code

		}
	}

	/**
	 * affichage de la liste des livres contenu dans arraylist
	 *
	 */
	@Override
	public String toString() {
		return "Bibliotheque [livres=" + listlivres + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bibliotheque livres = new Bibliotheque();
		livres.listlivres.add(new Livre("Diallo", "Mamadou", "ABCD", "Foot"));
		livres.listlivres.add(new Livre("Amal", "Fares", "ABnf", "Manga"));
		livres.listlivres.add(new Livre("thomas", "girad", "ABtD", "baseball"));

		 /* AffecterCode permet de parcourir la list des livres , 
		   ensuite appel la fonction Construirecode qui se trouve dans la classe livre pour construire le code
		   
		   *
		   */
		livres.AffecterCode();
		System.out.println(livres.toString());

	}

}

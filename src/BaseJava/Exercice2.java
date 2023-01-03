package BaseJava;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {

		// Saisi de la chaine par l'utilisateur
		Scanner s = new Scanner(System.in);
		System.out.println("saisir une chaine");
		String chaine = s.nextLine();
		System.out.println(chaine);

// Affichage  en Minuscule
		System.out.println(" La chaine en majuscule:" + chaine.toLowerCase());

		// Affichage de la chaine en majuscule
		System.out.println(" La chaine en majuscule:" + chaine.toUpperCase());

	}

}

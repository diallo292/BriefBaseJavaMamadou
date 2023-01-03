package BaseJava;

import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {

		// Saisi de la chaine par l'utilisateur
		Scanner s = new Scanner(System.in);
		System.out.println("saisir une chaine");
		String chaine = s.nextLine();
		System.out.println(chaine);

		char ch = '*';

		StringBuilder sb = new StringBuilder(chaine);

		int position = 0;
		// On parcours la chaine et on remplace les pair par *

		for (int i = 0; i < chaine.length(); i++) {
			// Je test
			if (position < chaine.length()) {
				sb.setCharAt(position, ch);
				position += 2;

			}
		}
		chaine = sb.toString();

		System.out.println(chaine);
		// TODO Auto-generated method stub

	}

}

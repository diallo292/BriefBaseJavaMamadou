package BaseJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercice1 {

	// Function compter nombre occurences d'une chaine
	public static int compterOccurrences(String maChaine, char recherche) {
		int nb = 0;
		for (int i = 0; i < maChaine.length(); i++) {
			if (maChaine.charAt(i) == recherche)
				nb++;
		}
		return nb;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Compter le nombre d'occurence de chaque caractere d'une chaine
		Scanner s = new Scanner(System.in);
		System.out.println("saisir une chaine");
		String chaine = s.nextLine();
		System.out.println(chaine);
		char c = ' ';
		int nbr = 0;
		// Pour stocker les caracteres et leurs nombres d'occurence
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < chaine.length(); i++) {

			c = chaine.charAt(i);
			nbr = compterOccurrences(chaine, c);
			// On stock les occurences de chaque lettre dans la map
			map.put(c, nbr);

		}
		// AFFICHAGE de la map

		for (Map.Entry<Character, Integer> m : map.entrySet()) {

			System.out.print("{" + m.getKey() + ":" + m.getValue() + "}");
		}

	}

}

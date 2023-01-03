package BaseJava;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Triangle {

	private double cote1;
	private double cote2;
	private double cote3;
	private double hateur;
	private double base;

	/**
	 * 
	 * la fonction permet de calculer le perimetre du triangle
	 * 
	 * @param cote1
	 * @param cote2
	 * @param cote3
	 * @return
	 */
	public double CalculerPerimetre(double cote1, double cote2, double cote3) {

		return cote1 + cote2 + cote3;

	}

	/**
	 * Permet de calculer l'aire du triangle en connaissant la base et la hauteur
	 * 
	 * @param base
	 * @param hauteur
	 * @return
	 */
	public double CalculerAire(double base, double hauteur) {

		return (base * hateur) / 2;
	}

	/**
	 * 
	 * fonction de reduction du traingle
	 * 
	 * @param valeur
	 */
	public void ReduireTriangle(double valeur) {
		if (valeur > 0 && valeur < cote1 && valeur < cote2 && valeur < cote3) {
			cote1 -= valeur;
			cote2 -= valeur;
			cote3 -= valeur;
		} else
			System.out.println(
					" Ne prends pas de valeur negative ou la valeur de reduction est trop grande par rapport au coté du traingle");
	}

	public double getCote1() {
		return cote1;
	}

	public void setCote1(double cote1) {
		this.cote1 = cote1;
	}

	public double getCote2() {
		return cote2;
	}

	public void setCote2(double cote2) {
		this.cote2 = cote2;
	}

	public double getCote3() {
		return cote3;
	}

	public void setCote3(double cote3) {
		this.cote3 = cote3;
	}

	public double getHateur() {
		return hateur;
	}

	public void setHateur(double hateur) {
		this.hateur = hateur;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	// la Fonction Main

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		// Saisi de la chaine par l'utilisateur
		Scanner s = new Scanner(System.in);

		// on demande à l'utilisateur d'entrer le cote 1
		System.out.println("saisir le premier cote du triangle");
		triangle.setCote1(s.nextDouble());

		// on demande à l'utilisateur d'entrer le cote 2
		System.out.println("saisir le deuxieme cote du triangle");
		triangle.setCote2(s.nextDouble());

		// on demande à l'utilisateur d'entrer le cote 3
		System.out.println("saisir le troisieme cote du triangle");
		triangle.setCote3(s.nextDouble());
		// On Calcul le perimetre en appelant la fonction CalculerPerimetre de l'objet
		// triangle
		System.out.println("Le perimetre du triangle est:"
				+ triangle.CalculerPerimetre(triangle.getCote1(), triangle.getCote2(), triangle.getCote3()));

		// On calcul l'air du triangle en demandant l'utilisateur d'entrer la base et la
		// hauteur

		System.out.println("saisir la base du triangle");
		triangle.setBase(s.nextDouble());

		System.out.println("saisir la hauteur du triangle");
		triangle.setHateur(s.nextDouble());

		System.out.println(" L'air du triangle est=" + triangle.CalculerAire(triangle.getBase(), triangle.getHateur()));

		// Reduire le triangle

		System.out.println(triangle.toString()); // avant de reduire
		System.out.println();
		System.out.println("saisir une valeur à fin de reduire le triangle/n");
		triangle.ReduireTriangle(s.nextDouble());
		System.out.println(triangle.toString()); // apres reduction

	}

	@Override
	public String toString() {
		return "Triangle [cote1=" + cote1 + ", cote2=" + cote2 + ", cote3=" + cote3 + ", hateur=" + hateur + ", base="
				+ base + "]";
	}

}

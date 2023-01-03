package BaseJava;

public class Exercice6 {
	private int a;
	private int b;

	// Fonction multiplication
	public static double Multiplication(double a, double b) {

		return a * b;

	}

	// Fonction somme
	public static double Somme(double a, double b) {
		return a + b;
	}

	// fonction Soustraction

	public static double Soustraction(Double a, double b) {
		return a - b;
	}

	// fonction division
	public static double Division(double a, double b) {
		double division = 0.0;
		if (b != 0)
			division = a / b;

		else
			System.out.println("On ne peut pas diviser par ZEro");

		return division;
	}

	// Function puissance
	public static double Puissance(double a, double b) {
		return Math.pow(a, b);
	}

	public static void main(String[] args) {

		// Test des  operations mathematiques

		// Multiplication
		System.out.println("2*2=" + Multiplication(2.0, 2.0));
		
		// Somme
		System.out.println("2+2=" + Somme(2.0, 2.0));
		
		
		// Soustraction
		System.out.println("2-2=" + Soustraction(2.0, 2.0));
		
		
		// division

		System.out.println("2/2=" + Division(2.0, 2.0));

		// puissance
		System.out.println("2^2=" + Puissance(2.0, 2.0));
		// TODO Auto-generated method stub

	}

}

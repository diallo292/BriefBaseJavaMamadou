package BaseJava;

import java.util.ArrayList;

public class Etudiant {

	private String prenom;
	private String nom;
	private double moyenne;
	private ArrayList<Note> notes = new ArrayList<Note>();

	public Etudiant(String prenom, String nom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}

	//

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> note) {
		this.notes = notes;
	}

	public double CalculerMoyenne() {
		// on parcours la list des note
		double moyenne = 0.0;
		int nombredeMatiere = notes.size();
		for (Note note : notes) {
			moyenne += note.getNote();

		}

		return moyenne / nombredeMatiere;

	}

	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prenom=" + prenom + "]";
	}

	/*
	 * Affichage du trigramme
	 * 
	 * Afficher la premiere lettre du prenom suivi de la premiere lettre du nom
	 * ,Suivi de la derniere lettre du Nom
	 */
	public void Trigramme() {

		System.out.println("Le trigramme est :" + this.prenom.charAt(0) + "" + this.nom.charAt(0) + ""
				+ this.prenom.charAt((this.nom.length() - 1)));

	}

	public static void main(String[] args) {
		// Ajout de trois notes
		Etudiant etudiant = new Etudiant("Mamadou", "Diallo");
		etudiant.notes.add(new Note("Mathematique", 15.0));
		etudiant.notes.add(new Note("pysique", 18.0));
		etudiant.notes.add(new Note("informatique", 19.0));

		/*
		 * Calcul et Affichage de la moyenne En utilisant la fonction CalculerMoyenne()
		 * ( (15+18+19)/3= 17.33 )
		 */
		System.out.println("La moyenne est:" + etudiant.CalculerMoyenne());

		// Affichage des initiales

		System.out.println(etudiant.toString());

		// Affichage trigramme
		etudiant.Trigramme(); // Affiche MDo

		// System.out.println(etudiant.prenom.length());

	}

}

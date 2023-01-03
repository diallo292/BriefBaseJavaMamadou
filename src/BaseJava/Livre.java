package BaseJava;

public class Livre {

	private String nom;
	private String prenom;
	private String ISBN;
	private String categorie;
	private String Code;

	/**
	 * La fonction qui permet de reconstruire le code 2 premiere lettres du premon
	 * suivi de 2 premieres du nom suivi de la premiere lettre de category suivi des
	 * 2 dernieres lettres de L'ISBN
	 * 
	 */
	public void ConstruireCode() {
		Code = prenom.charAt(0) + "" + prenom.charAt(1) + "" + nom.charAt(0) + "" + nom.charAt(1) + ""
				+ categorie.charAt(0) + "" + ISBN.charAt((this.ISBN.length() - 2)) + ""
				+ ISBN.charAt((this.ISBN.length() - 1));

	}

	@Override
	public String toString() {
		return "Livre [nom=" + nom + ", prenom=" + prenom + ", ISBN=" + ISBN + ", categorie=" + categorie + ", Code="
				+ Code + "]";
	}

	public Livre(String nom, String prenom, String iSBN, String categorie) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		ISBN = iSBN;
		this.categorie = categorie;
	}

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

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

}

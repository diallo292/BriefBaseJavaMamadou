package BaseJava;

public class Note {
private String matiere;
private double note;
public String getMatiere() {
	return matiere;
}
public void setMatiere(String matiere) {
	this.matiere = matiere;
}
public double getNote() {
	return note;
}
public Note(String matiere, double note) {
	super();
	this.matiere = matiere;
	this.note = note;
}
public void setNote(double note) {
	this.note = note;
}

}

package PGL.pglp_3_2;

public class Employe {
	private  String nom;
	private  int annee_arriv;
	
	public Employe(String nom,int annee) {
		this.setNom(nom);
		this.setAnnee_arrivee(annee);
	}
	
	public double calculSalaire() {
		return 500;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAnnee_arriv() {
		return annee_arriv;
	}

	public void setAnnee_arrivee(int annee_arriv) {
		this.annee_arriv = annee_arriv;
	}

}

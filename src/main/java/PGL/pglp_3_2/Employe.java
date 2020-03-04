package PGL.pglp_3_2;
import java.util.Calendar;

public class Employe {
	private  String nom;
	private  int annee_arriv;
	
	public Employe(String nom,int annee) {
		this.setNom(nom);
		this.setAnnee_arrivee(annee);
	}
	
	public double calculSalaire() {
		Calendar c = Calendar.getInstance();
		int annee_cour = c.get(Calendar.YEAR);
		return 1500+20*(annee_cour-annee_arriv);
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

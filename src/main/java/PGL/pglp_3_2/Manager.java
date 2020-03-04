package PGL.pglp_3_2;

import java.util.Calendar;

public class Manager extends Employe{

	private int nbEmployesSousOrdre;
	
	
	public Manager(String nom, int annee, int nbEmployesSousOrdre) {
		super(nom, annee);
		this.setNbEmployesSousOrdre(nbEmployesSousOrdre);
	}
	
	public void incrNbSO(){
		nbEmployesSousOrdre++;	
	}
	
	public int getNbEmployesSousOrdre() {
		return nbEmployesSousOrdre;
	}
	
	public void setNbEmployesSousOrdre(int nbEmployesSousOrdre) {
		this.nbEmployesSousOrdre = nbEmployesSousOrdre;
	}

	public double calculSalaire() {
		Calendar c = Calendar.getInstance();
		int annee_cour = c.get(Calendar.YEAR);
		
		return 1500+20*(annee_cour-getAnnee_arriv())+nbEmployesSousOrdre*100;
	}
}

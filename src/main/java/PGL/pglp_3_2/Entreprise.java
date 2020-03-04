package PGL.pglp_3_2;

import java.util.ArrayList;

public class Entreprise {
	
	private ArrayList<Employe> listeEmp;
	
	public Entreprise() {
		listeEmp = new ArrayList<Employe>();
	}
	
	public void ajoutEmploye(Employe E) {
		this.listeEmp.add(E);
	}
	
	public double calculSommeSalaires() {
		double S;
		S=0;
		
		for(Employe E: listeEmp) {
			S= S+E.calculSalaire();
		}
		return S;
	}


}

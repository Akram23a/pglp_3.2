package PGL.pglp_3_2;

import java.util.ArrayList;

public class Entreprise {
	
	private ArrayList<Vendeur> listeVen;
	private ArrayList<Manager> listeMan;

	
	public Entreprise() {
		listeVen = new ArrayList<Vendeur>();
		listeMan = new ArrayList<Manager>();

	}
	
	public void ajoutVendeur(Vendeur E) {
		this.listeVen.add(E);
	}
	public void ajoutManager(Manager E) {
		this.listeMan.add(E);
	}
	
	public double calculSommeSalaires() {
		double S;
		S=0;
		
		for(Vendeur V: listeVen) {
			S= S+V.calculSalaire();
		}
		
		for(Manager F: listeMan) {
			S= S+F.calculSalaire();
		}
		
		
		return S;
	}


}

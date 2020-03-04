package PGL.pglp_3_2;

import java.util.Calendar;

public class Vendeur extends Employe{
	private double commission;

	public Vendeur(String nom, int annee, double commission) {
		super(nom, annee);
		this.commission=commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public double calculSalaire() {
		Calendar c = Calendar.getInstance();
		int annee_cour = c.get(Calendar.YEAR);
		return 1500+20*(annee_cour-getAnnee_arriv());
	}

}

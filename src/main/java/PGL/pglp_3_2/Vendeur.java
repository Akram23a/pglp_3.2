package PGL.pglp_3_2;

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

}

package PGL.pglp_3_2;
/**
 * @author Akram
 */
public class Vendeur extends Employe {
	/**
	 */
	private double commission;
	/**
	 * @param nom name
	 * @param annee year
	 * @param commission1 commission
	 */
	public Vendeur(final String nom, final int annee, final double commission1) {
		super(nom, annee);
		this.commission = commission1;
	}
	/**
	 * @return commission
	 */
	final public double getCommission() {
		return commission;
	}
	/**
	 * @param commission1 commission
	 */
	final public void setCommission(double commission1) {
		this.commission = commission1;
	}
	/**
	 */
	public double calculSalaire() {
		return super.calculSalaire() + commission;
	}
}

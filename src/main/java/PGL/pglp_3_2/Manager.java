package PGL.pglp_3_2;
/**
 * @author Akram
 */
public class Manager extends Employe{
	/**
	 */
	private int nbEmployesSousOrdre;
	/**
	 * @param nom
	 * @param annee
	 * @param nbEmployesSousOrdre
	 */
	public Manager(String nom, int annee, int nbEmployesSousOrdre1) {
		super(nom, annee);
		this.setNbEmployesSousOrdre(nbEmployesSousOrdre1);
	}
	/**
	 */
	public void incrNbSO() {
		nbEmployesSousOrdre++;	
	}
	/**
	 * @return  Managed Employees
	 */
	final public int getNbEmployesSousOrdre() {
		return nbEmployesSousOrdre;
	}
	/**
	 * @param nbEmployesSousOrdre1   Managed Employees
	 */
	final public void setNbEmployesSousOrdre(final int nbEmployesSousOrdre1) {
		this.nbEmployesSousOrdre = nbEmployesSousOrdre1;
	}
	/**
	 */
	public double calculSalaire() {	
		return super.calculSalaire() + nbEmployesSousOrdre * 100;
	}
}

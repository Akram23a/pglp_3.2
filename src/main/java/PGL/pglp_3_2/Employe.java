package PGL.pglp_3_2;
import java.util.Calendar;
/**
 * @author Akram
 */
public class Employe {
	/**
	 */
	private  String nom;
	private  int annee_arriv;
	/**
	 * @param nom name
	 * @param annee year
	 */
	public Employe(String nom,int annee) {
		this.setNom(nom);
		this.setAnnee_arrivee(annee);
	}
	/**
	 * @return Salary
	 */
	public double calculSalaire() {
		Calendar c = Calendar.getInstance();
		int annee_cour = c.get(Calendar.YEAR);
		return 1500 + 20 * (annee_cour - getAnnee_arriv());
	}
	/**
	 * @return name
	 */
	final public String getNom() {
		return nom;
	}
	/**
	 * @param nom1 name
	 */
	final public void setNom(String nom1) {
		this.nom = nom1;
	}
	/**
	 * @return arriving year
	 */
	final public int getAnnee_arriv() {
		return annee_arriv;
	}
	/**
	 * @param annee_arriv1 arriving year
	 */
	final public void setAnnee_arrivee(int annee_arriv1) {
		this.annee_arriv = annee_arriv1;
	}
}

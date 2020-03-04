package PGL.pglp_3_2;
import java.util.ArrayList;
/**
 * @author Akram
 */
public class Entreprise {
	/**
	 */
	private ArrayList<Employe> listeEmp;
	public Entreprise() {
		listeEmp = new ArrayList<Employe>();
	}
	/**
	 * @param E employee
	 */
	public void ajoutEmploye(Employe e) {
		this.listeEmp.add(e);
	}
	/**
	 * @return Salary sum
	 */
	public double calculSommeSalaires() {
		double s;
		s = 0;
		for (Employe v: listeEmp) {
			s = s + v.calculSalaire();
		}
		return s;
	}
}

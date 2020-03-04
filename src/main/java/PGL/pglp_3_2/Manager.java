package PGL.pglp_3_2;

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
		return super.calculSalaire()+nbEmployesSousOrdre*100;
	}
}

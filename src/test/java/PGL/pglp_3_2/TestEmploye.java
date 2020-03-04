package PGL.pglp_3_2;

import org.junit.Test;

public class TestEmploye {
	@Test
	public void CalculSalaireEmployeTest() {
		Employe E= new Employe("Four",2015);
		assert (E.calculSalaire()==1600);
	}
}

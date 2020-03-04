package PGL.pglp_3_2;

import org.junit.Test;

public class TestEntreprise {

	@Test
	public void CalculSalaires() {
        Manager C=new Manager("C",2016,3);
        Vendeur A=new Vendeur("A",2014,100);
        Entreprise B=new Entreprise();
        B.ajoutEmploye(C);
        B.ajoutEmploye(A);
        
		assert(3600==B.calculSommeSalaires());
	}
}

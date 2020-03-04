package PGL.pglp_3_2;
import org.junit.Test;

public class TestVendeur {

	@Test
	public void TestCalculSalaire() {
		Vendeur A=new Vendeur("t1", 2016, 100);
		assert(A.calculSalaire()==1680);
	}

}
	

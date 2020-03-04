package PGL.pglp_3_2;

import org.junit.Test;

public class TestManager {
	
	@Test
	public void CalculSalaireManagerTest() {
        Manager D=new Manager("two",2016,3);
		assert(1880==D.calculSalaire());
	}
}


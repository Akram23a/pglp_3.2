package PGL.pglp_3_2;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Entreprise A=new Entreprise();
        Vendeur C=new Vendeur("one",2015,100);
        Manager D=new Manager("two",2014,3);
        
        A.ajoutEmploye(D);
        A.ajoutEmploye(C);

        System.out.println(A.calculSommeSalaires());
        
        

        
    }
}

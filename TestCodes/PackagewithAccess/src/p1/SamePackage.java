package p1;

public class SamePackage {

	//Constructor
	public SamePackage ()
	{
		Protection P1 = new Protection() ; 
		
		System.out.println ("You are in SamePackage class under Package, p1");
		System.out.println ("n " +P1.n ) ; 
		
		//can't access due to Private access protection: class only
		//System.out.println ("n_pri " +P1.n_pri ) ; 
		
		System.out.println ("n_pub " +P1.n_pub ) ;
		
		System.out.println ("n_pro " +P1.n_pro ) ; 
	}

}

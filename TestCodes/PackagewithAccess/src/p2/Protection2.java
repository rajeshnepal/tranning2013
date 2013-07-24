package p2;


public class Protection2 extends p1.Protection{
	

	//Constructor
	public Protection2() 
	{
		System.out.println ("You are in Protection2 class under Package, p2");
		
		//Can't access due to default access protection; class or package only
		//System.out.println ("n " +n ) ; 
		
		//can't access due to Private access protection: class only
		//System.out.println ("n_pri " +P1.n_pri ) ; 
		
		System.out.println ("n_pub " +n_pub ) ;
		 
		System.out.println ("n_pro " +n_pro ) ; 
	}
	
}


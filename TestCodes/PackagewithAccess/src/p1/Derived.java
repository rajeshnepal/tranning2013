package p1;

public class Derived extends Protection{

	//Constructor 
	public Derived (){
		
	System.out.println ("You are in Derived class under Package p1");
	System.out.println ("n " +n ) ; 
	
	//can't access due to Private access protection: class only
	//System.out.println ("n_pri " +n_pri ) ; 
	
	System.out.println ("n_pub " +n_pub ) ;
	
	System.out.println ("n_pro " +n_pro ) ; 
	
	}
	
}


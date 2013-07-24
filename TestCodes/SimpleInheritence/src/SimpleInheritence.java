class SuperClass
{
			int i = 10 ; 
			int j = 20; 
  private 	int k = 50;
  
  public SuperClass ()
  {
	  i = j = k = 456 ; 
  }
  
 public void showSuper ()
  {
	  System.out.println ("Valuse are: i = " +i + " j = " + j + " k= " + k);
  }
  
  
}

class SubClass extends SuperClass 
{
			int a = 10 ; 
			int b = 20 ; 
	private int c = 60 ; 
	
	public SubClass ()
	{
		a = b = c = 4789 ; 
	}
	public void show ()
	{
		  System.out.println ("Valuse are: a = " +a + " b = " +b + " c = " +c);
		  	
	}
	
	public void DisplayAll ()
	{
		System.out.println ("Valuse are: i = " +i + " j = " +j ); //since k is not visible in subclass due to privateness
		System.out.println ("Valuse are: a = " +a + " b = " +b + " c = "+ c);
		  	
	}
}

public class SimpleInheritence {

	public static void main (String args [])
	{
		SuperClass Spc = new SuperClass ();
		SubClass   Sbc = new SubClass()  ; 
		Spc.showSuper();
		Sbc.show();
		Sbc.DisplayAll();
		Sbc.showSuper();
		Spc = Sbc ; 
		System.out.println ("Assessing Super");
		Spc.showSuper () ; 
		
	}
}

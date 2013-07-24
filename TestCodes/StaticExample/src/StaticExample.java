
public class StaticExample {

	static int a = 5 ; 
	static int b; 
	
	static void math (int x)
	{
		System.out.println("Values are x = " +x) ; 
		System.out.println("Values are a = " +a) ;
		System.out.println("Values are b = " +b) ; 
			
	}
	
	static 
	{
		System.out.println("Intializeing Values ") ; 
		b = a*4;
		
	}

	public static void main (String args [])
	{
		math(5) ; 
	}
}

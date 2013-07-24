class Object
{
	//data member's
	int i;
	int j;
	
	//constructor 
	Object (int i , int j )
	{
		this.i = i ; 
		this.j = j ; 
	}
	
	//passing object test function 
	boolean Equals (Object o)
	{
		if (o.i == i && o.j == j)
			return true;
		else
			return false ; 
	}
	
}

public class PassObject 
{
	public static void main (String s[])
	{
		Object ob1 = new Object (1,2);
		Object ob2 = new Object (2,2);
		
		if (ob2.Equals (ob1))
			System.out.println("Equals");
		else 
			System.out.println ("Unequals");
		
		
	}
}

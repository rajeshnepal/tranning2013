class ThrowDemo
{
	static void ShowThrow ()
	{
		try 
		{
			throw new NullPointerException("NULL throw");
		}
		catch (NullPointerException e)
		{
			System.out.println ("Exception caught in catch");
			throw e ; 
		}
	} 
}

public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			ThrowDemo.ShowThrow();
		}
		catch (NullPointerException e)
		{
			System.out.println ("Exception caught in catch in main");
		}
	}

}

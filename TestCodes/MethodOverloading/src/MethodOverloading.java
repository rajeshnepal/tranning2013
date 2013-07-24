
class OverloadDemo  
{
	void test ()
	{
		System.out.println("No Parameter");
	}
	void test (int i)
	{
		System.out.println("Integer Parameter" +i);
	}
	void test (int a, int b)
	{
		System.out.println("Two Parameter" +a +"and" +b);
	}
}

public class MethodOverloading 
{
	public static void main (String s[])
	{
		OverloadDemo ob = new OverloadDemo();
		ob.test();
		ob.test(10);
		ob.test(10,20) ; 
	}

}

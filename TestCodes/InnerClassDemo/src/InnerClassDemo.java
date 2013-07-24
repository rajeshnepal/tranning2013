class OuterClass
{
	int outer_i = 100  ; 
	
	void display_outer ()
	{
		System.out.println("in OuterClass, value = " +outer_i);
	}
	
	class InnerClass 
	{
		int inner_i = 50 ; 
		
		void display_inner ()
		{
			System.out.println("in InnerClass, value = " +inner_i);
			System.out.println ("In inner class, outer value " +outer_i);
		}
	}
	
	void Show ()
	{
		InnerClass in = new InnerClass ();
		in.display_inner ();
		display_outer(); 
		System.out.println("in Show inner_i = " +in.inner_i +" outer_i = " +outer_i );
	}
	
}

public class InnerClassDemo {

	public static void main (String args[])
	{
		OuterClass out = new OuterClass () ; 
		
		out.display_outer();
		out.Show();
	}
	
}

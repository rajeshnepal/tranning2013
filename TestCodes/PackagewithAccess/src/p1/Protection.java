package p1;

public class Protection {
		int n = 1 ; // default protection 
		private int n_pri = 5 ; //Private protection
		public int n_pub = 10 ; //Public protection
		protected int n_pro = 15 ; // Protected protection 
		
		//Constructor
		public Protection ()
		{
			System.out.println ("You are in Protection class under Package p1");
			System.out.println ("n " +n ) ; 
			System.out.println ("n_pri " +n_pri ) ; 
			System.out.println ("n_pub " +n_pub ) ;
			System.out.println ("n_pro " +n_pro ) ; 
					
		}
}




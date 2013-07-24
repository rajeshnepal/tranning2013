import java.io.*;


public class ReadExample {
		int i ; 
		char ch ;
		
private BufferedReader br ;  
		
		public ReadExample () throws IOException
		{
			i = -1 ; 
			ch = 'q'; 
			br = new BufferedReader(new InputStreamReader (System.in)) ; 
			
		}
		public ReadExample (int i , char ch)
		{
			this.i = i ; 
			this.ch = ch ; 
			br = new BufferedReader(new InputStreamReader (System.in)) ; 
			
		}
		
		public void show ()
		{
			System.out.println (" i : " +i) ; 
			System.out.println (" ch : " +ch) ; 
		}
		
		public void GetValuesFromConsol () throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader (System.in)) ; 
			
			System.out.println ("Please enter the value of i and ch, one by one\n");
			
			i =   br.read() - 48;
			ch =  (char) br.read(); 
		}
	
}


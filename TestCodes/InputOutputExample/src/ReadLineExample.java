import java.io.* ; 

public class ReadLineExample {

			String str ;
	private BufferedReader br  ; 
			
			
			
	public ReadLineExample () throws IOException
	{
		str = "Hello Default String" ; 
		br = new BufferedReader(new InputStreamReader (System.in)) ; 
	
	}
	
	public ReadLineExample (String str)
	{
		this.str = str ;
		br = new BufferedReader(new InputStreamReader (System.in)) ; 
		
	}
	
	public void show ()
	{
		System.out.println ("Your class Content are as follows: \n") ; 
		System.out.println ("str: " +str);
		
	}
	
	public void GetValuesFromConsol () throws IOException
	{
		str = br.readLine() ; 
		
	}
}

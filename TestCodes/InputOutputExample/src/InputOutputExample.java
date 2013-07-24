import java.io.IOException;


public class InputOutputExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadExample ReDefault = new ReadExample() ; 
		ReadExample ReCreate = new ReadExample(5,'r') ;
		
		ReCreate.show(); 
		
		System.out.println ("Time to get values from consol");
		ReDefault.GetValuesFromConsol();
		ReDefault.show () ; 
		
		System.out.println ("Time to get String ");
		
		ReadLineExample RlDefault  = new ReadLineExample() ; 
		ReadLineExample RlCreate   = new ReadLineExample("Here is New string") ; 
		
		RlCreate.show();
		System.out.println ("Input string\n");
		RlDefault.GetValuesFromConsol(); 
		RlDefault.show () ;
		
		
	}

}

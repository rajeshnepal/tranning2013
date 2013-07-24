/**
 * 
 */
package p2;

/**
 * @author nitingupta
 *
 */
public class OtherPackage {

	public OtherPackage ()
	{
		p1.Protection P1 = new p1.Protection (); 
		

		System.out.println ("You are in OtherPackage class under Package, p2");
		
		//Can't access due to default access protection; class or package only
		//System.out.println ("n " +P1.n ) ; 
		
		//can't access due to Private access protection: class only
		//System.out.println ("n_pri " +P1.n_pri ) ; 
		
		System.out.println ("n_pub " +P1.n_pub ) ;

		//Can't access due to protect access protection: class, subclass and package only
		//System.out.println ("n_pro " +P1.n_pro ) ; 
	
	}
}
 

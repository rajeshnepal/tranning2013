class Box
{
	//Box attributes 
	private double hight ; 
	private double width ; 
	private double depth ; 
	
	//Box Constructor
	public Box ()
	{
		hight = width = depth = -1 ; // no dimension defined 
	}
	
	public Box (double hight, double width , double depth)
	{
		this.hight = hight ; 
		this.width = width ;
		this.depth = depth ; 
	}
	
	public Box (Box ob)
	{
		width = ob.width ; 
		hight = ob.hight;
		depth = ob.depth ; 
	}
	
	public double BoxVolume ()
	{
		return width*hight*depth ; 
	}
	
}

class BoxWeight extends Box
{
	//adding weight functionality 
	private double weight ; 
	
	//Constructor 
	public BoxWeight ()
	{
		super () ; 
		weight = -1 ; 
	}
	
	public BoxWeight (double weight , double hight,   double width, double depth)
	{
		super (hight, width, depth) ; 
		this.weight = weight ; 
		
	}
	
	public BoxWeight (BoxWeight ob)
	{
		super (ob) ; 
		weight = ob.weight ; 
	}
	
	public double Wight ()
	{
		return weight ;
	}
	
}

public class DemoSuper {
	
	public static void main (String args [])
	{
		Box BoxObject1 = new Box () ; 
		
		Box BoxClone = new Box (BoxObject1) ; 
		
		Box BoxObject2 = new Box (1,2,3) ; 
		
		BoxWeight BoxWeightObject1 = new BoxWeight() ; 
		
		BoxWeight BoxWeightclone = new BoxWeight(BoxWeightObject1) ;
		
		BoxWeight BoxWeightObject2 = new BoxWeight(1,2,3,4) ;
		
		System.out.println ("Volume BoxObject1 = " +BoxObject1.BoxVolume() );
		System.out.println ("Volume Boxclone = " +BoxClone.BoxVolume());
		System.out.println ("Volume BoxObject2 = " +BoxObject2.BoxVolume());
		
		System.out.println ("Volume BoxWeightObject1 = " +BoxWeightObject1.BoxVolume() +" Weight = " +BoxWeightObject1.Wight());
		System.out.println ("Volume BoxWeightClone = " +BoxWeightclone.BoxVolume()+" Weight = " +BoxWeightclone.Wight());
		System.out.println ("Volume BoxWeightObject2 = " +BoxWeightObject2.BoxVolume()+" Weight = " +BoxWeightObject2.Wight());
		
		
	}

}

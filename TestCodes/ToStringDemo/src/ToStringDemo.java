class Box
{
	private double length ; 
	private double depth ; 
	private double width ; 
	
	public Box ()
	{
		length= depth = width = -1 ; 
	}
	public Box (final double length , final double depth , final double width)
	{
		this.length = length; 
		this.depth = depth ; 
		this.width = width ; 
	}
	public String toString ()
	{
		return "Box Dimension is " + width + " By " + length + " By " + depth ; 
	}
	
}
public class ToStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box b = new Box (5,6,7) ; 
		String str = "Box b: " + b; // for b; its call toString class automatically 
		
		System.out.println (b);
		System.out.println (str) ; 
	}

}

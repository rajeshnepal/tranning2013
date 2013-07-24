abstract class Figure
{
	double dim1 ; 
	double dim2; 
	
	//constructor
	public Figure (double dim1, double dim2)
	{
		this.dim1 = dim1 ; 
		this.dim2 = dim2 ; 
		
	}
	
	abstract double Area () ; 
}

class Triangle extends Figure
{
	public Triangle (double a, double b)
	{
		super (a,b) ; 
	}
	
	double Area ()  
	{
		return 1.5*dim1*dim2 ; 
	}
}

class Rectangle extends Figure
{
	public Rectangle (double a, double b)
	{
		super (a,b) ; 
	}
	
	double Area ()  
	{
		return dim1*dim2 ; 
	}
}


public class AbstractClassExample {

	public static void main (String args [])
	{
		Triangle T = new Triangle (1,2) ;
		Rectangle R = new Rectangle (5,2) ;
		
		Figure F; 

		F = T ; 

		System.out.println ("Area of Triangle is = " + F.Area() );
		
		F = R ; 

		System.out.println ("Area of Rectangle is = " + F.Area() );
		
	}
}

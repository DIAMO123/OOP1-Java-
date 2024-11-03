import java.lang.*;
public class rectangle extends Shape
{
	double y;
	public rectangle ()
	{
		System.out.println ("empty rectangle");
	}
	public rectangle (double x,double y)
	{
		super(x);
		this.y=y;
	}
	public void sety(double y)
	{
		this.y=y;
	}
	public double gety()
	{
		return y;
	}
	 void area( )
	{
		System.out.println( x*y);
	}
	
}
import java.lang.*;
public class triangle extends shape
{
	double y;
	double z;
	public triangle ()
	{
		System.out.println ("empty triangle");
	}
	public triangle (double x,double y,double z)
	{
		super(x);
		this.y=y;
		this.z=z;
	}
	public void sety(double y)
	{
		this.y=y;
	}
	public void setz(double z)
	{
		this.z=z;
	}
	public double gety()
	{
		return y;
	}
	public double getz()
	{
		return z;
	}
	public double getarea()
	{
		return x+y+z;
	}
}
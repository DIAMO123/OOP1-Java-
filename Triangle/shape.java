import java.lang.*;
public class shape
{
	double x;
	public shape ()
	{
		System.out.println("empty shape");
	}
	public shape (double x)
	{
		this.x=x;
	}
	public void setx(double x)
	{
		this.x=x;
	}
	public double getx()
	{
		return x;
	}
}
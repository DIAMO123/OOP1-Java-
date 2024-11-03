import java.lang.*;
public class implicite
{
	public double length;
	public double width;
	public double heigth;
	
	public void setlength(double l)
	{
		length=1;
	}
	public void setwidth(double w)
	{
		width=w;
	}
	public void setheigth(double h)
	{
		heigth=h;
	}
	public double getlength()
	{
		return length;
	}
	public double getwidth()
	{
		return width;
	}
	public double getheigth()
	{
		return heigth;
	}
	public static void main(String[] args)
	{
		implicite i=new implicite();
		i.setlength(12);
		i.setlength(29);
		i.setlength(50);
		
		System.out.println("Length:  "+i.getlength());
		System.out.println("Width:  "+i.getwidth());
		System.out.println("heigth:  "+i.getheight());
	}
	
}
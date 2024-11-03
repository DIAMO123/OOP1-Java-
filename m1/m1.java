import java.lang.*;
public class m1
{
	private int a;
	public static int b=10;
	public m1()
	{
		System.out.println("don't worry");
		b++;
		
	}
	public m1(int a)
	{
		this.a=a;
		System.out.println("programming is fun");
		b=b+2;
	}
	public void seta(int a)
	{
		System.out.println("keep trying");
		this.a=a;
	}
	public  void setb(int b)
	{
		System.out.println("you will get there");
		this.b=b;
	}
	public void display()
	{
		System.out.println("b "+b+" "+"a "+a);
	}
}
import java.lang.*;
public class m1new extends m1
{
	private int x;
	public m1new()
	{
		System.out.println("if understood");
	}
	public m1new(int a,int x)
	{
		super(a);
		this.x=x;
		System.out.println("don't loss your hope");
	}
	public void details()
	{
		super.display();
		System.out.println("x "+x);
	}
}

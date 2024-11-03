import java.lang.*;

public class teacher extends person
{
	int id;
	
	public teacher()
	{
		System.out.println("empty teacher");
	}
	public teacher(String name,int age,int id)
	{
		super(name,age);
		this.id=id;
		System.out.println("para teacher");
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id;
	}
	
	public void view()
	{
		super.view();
		System.out.println("ID ;"+id);
	}
}
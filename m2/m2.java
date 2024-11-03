import java.lang.*;
public class m2
{
	public String id,name,cgpa;
	public m2()
	{
		System.out.println("In default constructor");
	}
	public m2( String id,String name,String cgpa)
	{
		this.id=id;
		this.name =name;
		this .cgpa=cgpa;
		System.out.println("In valued constructor");
	}
	String getid()
	{
		return id;
	}
	String getname()
	{
		return name;
	}
	String getcgpa()
	{
		return cgpa;
	}
	
	void show()
	{
		System.out.println("id "+id);
		System.out.println("name "+name);
		System.out.println("cgpa "+cgpa);
	}
	public static void main(String[] args)
	{
		m2 ob[]=new m2[3];
		ob[0]=new m2();	
		ob[1]=new m2();
		for(int i=1;i<3;i++)
		{
			ob[i]=new m2("111","mr x","3.85");
		}
		for(int i=0;i<2;i++)
		{
			ob[i].show();
		}
	}
	
	
	
	
	
	
	
}
import java.lang.*;

public class person
{
	String name;
	int age;
	
	public person()
	{
		System.out.println("Empty person");
	}
	public person(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("parametirized person");
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void age(int age)
	{
		this.age=age;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	
	public void view()
	{
		System.out.println("name :"+name+"\n"+"Age :"+age);
	}
}
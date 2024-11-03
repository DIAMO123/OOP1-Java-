import java.lang.*;
public class person
{
	String name,address;
	
	public person ()
	{
		System.out.println("empty constructor for person");
	}
	public person (String name,String address)
	{
		this.name = name;
		this.address = address;
	}
	public void setname(String name)
	{
		this.name = name;
	}
	public void setaddress(String address)
	{
		this.address = address;
	}
	public String getname()
	{
		return name;
	}
	public String getaddress()
	{
		return address;
	}
	void ViewDetails1()
	{
		System.out.println("NAME - "+name);
		System.out.println("ADDRESS - "+address);
		
	}
	
}
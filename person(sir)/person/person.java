import java.lang.*;
public class person
{
	String name,dateOfBirth,bloodGroup;
	int age;
	public person()
	{
		System.out.println("empty for person");
	}
	public person(String name,int age,String dateOfBirth,String bloodGroup)
	{
		this.name=name;
		this.age=age;
		this.dateOfBirth=dateOfBirth;
		this.bloodGroup=bloodGroup;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public void setdateOfBirth(String dateOfBirth)
	{
		this.dateOfBirth=dateOfBirth;
	}
	public void setbloodGroup(String bloodGroup)
	{
		this.bloodGroup=bloodGroup;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{ 
	    return age;
 	}
	public String getdateOfBirth()
	{
		return dateOfBirth;
	}
	public String getbloodGroup()
	{
		return bloodGroup;
	}
	public void veiwdetailsPS()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("DateOfBirth:"+dateOfBirth);
		System.out.println("BloodGroup:"+bloodGroup);
	}
	
}
import java.lang.*;
public class teacher extends person
{
	String id;
	String department;
	String experience;
	public teacher()
	{
		System.out.println("Empty for teacher");
	}
	public teacher(String id,String department,String experience,String name,int age,String dateOfBirth,String bloodGroup)
	{
		super(name,age,dateOfBirth,bloodGroup);
		this.id=id;
		this.department=department;
		this.experience=experience;
		
	}
	public void setid(String id)
	{
		this.id=id;
	}
	public void setdepartment(String department)
	{
		this.department=department;
	}
	public void setexperience(String experience)
	{
		this.experience=experience;
	}
	public String getid()
	{
		return id;
	}
	public String getdepartment()
	{
		return department;
	}
	public String getexperience()
	{
		return experience;
	}
	public void viewDetailsTC()
	{
		System.out.println("Id:"+id);
		System.out.println("Department:"+department);
		System.out.println("Experience:"+experience);
	}
}
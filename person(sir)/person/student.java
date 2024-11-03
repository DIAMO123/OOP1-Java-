import java.lang.*;
public class student extends person
{
	String id;
	String department;
	String semester;
	public student()
	{
		System.out.println("Empty for Student");
	}
	public student(String id,String department,String semester,String name,int age,String dateOfBirth,String bloodGroup)
	{
		super(name,age,dateOfBirth,bloodGroup);
		this.id=id;
		this.department=department;
		this.semester=semester;
		
	}
	public void setid(String id)
	{
		this.id=id;
	}
	public void setdepartment(String department)
	{
		this.department=department;
	}
	public void setsemester(String semester)
	{
		this.semester=semester;
	}
	public String getid()
	{
		return id;
	}
	public String getdepartment()
	{
		return department;
	}
	public String getsemester()
	{
		return semester;
	}
	public void viewDetailsST()
	{
		System.out.println("Id:"+id);
		System.out.println("Department:"+department);
		System.out.println("Semester:"+semester);
	}
}
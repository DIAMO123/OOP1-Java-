import java.lang.*;
public class student extends person
{
	String course;
	double cgpa;
	public student ()
	{
		System.out.println("empty constructor for student");
	}
	public student (String name,String address,String course,double cgpa)
	{
		super(name,address);
		this.course = course;
		this.cgpa = cgpa;
	}
	public void setcourse(String course)
	{
		this.course = course;
	}
	public void setcgpa(double cgpa)
	{
		this.cgpa = cgpa;
	}
	public String getcourse()
	{
		return course;
	}
	public double getcgpa()
	{
		return cgpa;
	}
	void ViewDetails()
	{
		
		System.out.println("COURSE - "+course);
		System.out.println("CGPA - "+cgpa);
	}
	
}
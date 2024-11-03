import java.lang.*;

public class student extends person
{
	int id;
	double cgpa;
	
	public student()
	{
		System.out.println("Empty Student");
	}
	
	public student(String name,int age,int id,double cgpa)
	{
		super(name,age);
		this.id=id;
		this.cgpa=cgpa;
		System.out.println("para Student");		
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public void setcgpa(double cgpa)
	{
		this.cgpa=cgpa;
	}
	public int getid()
	{
		return id;
	}
	public double getcgpa()
	{
		return cgpa;
	}
	public void view()
	{
		super.view();
		System.out.println("ID :"+id+"\n"+"cgpa"+cgpa);
	}
	
}
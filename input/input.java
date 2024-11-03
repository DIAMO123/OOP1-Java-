import java.lang.*;
import java.util.Scanner;
public class input 
{
	public String Name,Varsity,Phone,Address;
	public int age;
	public double cgpa;
	public input()
	{
		System.out.println("BIOGRAPHY OF MINE");
	}
	public input(String Name,String Varsity,String Phone,String Address,int age,double cgpa)
	{
		this.Name=Name;
		this.Varsity=Varsity;
		this.Phone=Phone;
		this.Address=Address;
		this.age=age;
		this.cgpa=cgpa;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setVarsity(String Varsity)
	{
	    this.Varsity=Varsity;
	}
	public void setPhone(String Phone)
	{
		this.Phone=Phone;
	}
	public void setAddress(String Address)
	{
		this.Address=Address;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public void setcgpa(double cgpa)
	{
		this.cgpa=cgpa;
	}
	String getName()
	{
		return Name;
	}
	String getVarsit()
	{
		return Varsity;
	}
	String getPhone()
	{
		return Phone;
	}
	String getAddress()
	{
		return Address;
	}
	int getage()
	{
		return age;
	}
	double getcgpa()
	{
		return cgpa;
	}
	public void Details()
	{
		System.out.println("NAME - "+Name+"\n"+"VIRSITY - "+Varsity+"\n"+"PHONE - "+Phone+"\n"+"ADDRESS - "+Address+"\n"+"AGE - "+age+"\n"+"CGPA - "+cgpa);
	}
	
}
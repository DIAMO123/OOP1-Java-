import java.lang.*;
import java.util.*;

public class input
{
	String name;
	int age;
	String city;
	
	public input()
	{
		System.out.println("Empty");
	}
	public input(String name,int age,String city)
	{
		this.name=name;
		this.age=age;
		this.city=city;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public void setage(int age)
	{
		this.age=age;
	}
	public void setcity(String city)
	{
		this.city=city;
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
	}
	public String getcity()
	{
		return city;
	}
	public void display()
	{
		System.out.println("Name :"+name+"\n"+"Age :"+age+"\n"+"City :"+city);
	}
	
}
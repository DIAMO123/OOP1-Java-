import java.lang.*;
import java.util.Scanner;
public class Restaurent
{
	public String Id,Name;
	public Restaurent()
	{
		System.out.println("RESTAURENT");
	}
	public Restaurent(String Id,String Name)
	{
		this.Id=Id;
		this.Name=Name;
	}
	void setId(String Id)
	{
		this.Id=Id;
	}
	
	void setName(String Name)
	{
		this.Name=Name;
	}
	String getName()
	{
		return Name;
	}
	String getId()
	{
		return Id;
	}
	void Details()
	{
		System.out.println("RESTAURENT NAME - "+Name);
		System.out.println("RESTAURENT ID - "+Id);
	}
}

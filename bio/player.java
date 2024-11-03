import java.lang.*;
public class player{
public String Id,Name,City,Email;
player()	
{
	System.out.println("biodata of a player");
}
player(String Id,String Name,String City,String Email)	
{
	this.Id=Id;
	 this.Name=Name;
	  this.City=City;
	   this.Email=Email;
}
void setId(String Id)
{
	this.Id=Id;
}
void setName(String Name)
{
	this.Name=Name;
}
void setCity(String City)
{
	this.City=City;
}
void setEmail(String Email)
{
	this.Email=Email;
}
String getId()
{
	return Id;
}
String getName()
{
	return Name;
}
String getCity()
{
	return City;
}
String getEmail()
{
	return Email;
}
void ViewDetails()
{
	System.out.println("ID - "+Id);
	 System.out.println("NAME - "+Name);
	  System.out.println("CITY - "+City);
	   System.out.println("EMAIL - "+Email);
}
	public static void main(String[] args)
	{
		player p1 = new player();
		 player p = new player("22-48152-2","Diamond","Dhaka","diamond.halder28@gmail.com");
		 p.setId("22-481152-2");
		 p.setName("Diamond");
		 p.setCity("Dhaka");
		 p.setEmail("diamond.halder28@gmail.com");
		  p.ViewDetails();
	}
	
	
}
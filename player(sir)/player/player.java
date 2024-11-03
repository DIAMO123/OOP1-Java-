import java.lang.*;
public class player
{
	private int Id;
	private String Name;
	private String City;
	private String Email;
	public player()
	{ 
	   System.out.println("Empty constructor");
	}
	public player(int Id,String Name,String City,String Email)
	{
		this.Id=Id;
		this.Name=Name;
		this.City=City;
		this.Email=Email;
	}
	public void setId(int i)
	{
		Id=i;
	}
	public void setName(String n)
	{
		Name=n;
	}
	public void setCity(String c)
	{
		City=c;
	}
	public void setEmail(String e)
	{
		Email=e;
	}
	public int getId()
	{
		return Id;
	}
	public String getName()
	{
		return Name;
	}
	public String getCity()
	{
		return City;
	}
	public String getEmail()
	{
		return Email;
	}
	public void veiwDetails()
	{
	   System.out.println("Id:"+Id);
	   System.out.println("Name:"+Name);
	   System.out.println("City:"+City);
	   System.out.println("Email:"+Email);
		
	}
	public static void main(String[] args)
	{
		player p1=new player();
		player p2=new player(1234,"Rupa","Rajshahi","avi123@gmail.com");
		p1.setId(2345);
		p1.setName("Avi");
		p1.setCity("Dhaka");
		p1.setEmail("rupa123@gmail.com");
		
		p2.veiwDetails();
		
		System.out.println("Id:"+p1.getId());
		System.out.println("Name:"+p1.getName());
		System.out.println("City:"+p1.getCity());
		System.out.println("Email:"+p1.getEmail());
	}
}
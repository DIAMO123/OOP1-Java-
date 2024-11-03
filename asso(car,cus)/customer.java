import java.lang.*;
public class customer
{
	public String Name,Id,Phn;
	public customer()
	{
		System.out.println("non para");
	}
	public customer( String Name,String Id,String Phn)
	{
		this.Name=Name;
		this.Id=Id;
		this.Phn=Phn;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	public void setId(String Id)
	{
		this.Id=Id;
	}
	public void setPhn(String Phn)
	{
		this.Phn=Phn;
	}
	String getName()
	{
		return Name;
	}
	String getId()
	{
		return Id;
	}
	String getPhn()
	{
		return Phn;
	}
	public void details()
	{
		System.out.println("name "+Name);
		System.out.println("id "+Id);
		System.out.println("phn "+Phn);
	}	
}
import java.lang.*;
public class teacher extends person
{
	String Id,versity;
	public teacher ()
	{
		System.out.println("empty constructor for teacher");
	}
	public teacher (String name,String address,String Id,String versity)
	{
		super(name,address);
		this.Id = Id;
		this.versity = versity;
	}
	public void setId(String Id)
	{
		this.Id = Id;
	}
	public void setversity(String versity)
	{
		this.versity = versity;
	}
	public String getId()
	{
		return Id;
	}
	public String getversity()
	{
		return versity;
	}
	void ViewDetails()
	{
	
		System.out.println("ID - "+Id);
		System.out.println("VERSITY - "+versity);
	}
	
}
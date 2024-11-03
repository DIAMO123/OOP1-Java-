import java.lang.*;
public class car
{
	public String RegsNd,MODEL;
	public  customer Customer ;
	public car()
	{
		System.out.println("non para of car");
	}
	public car(String RegsNd,String MODEL,customer Customer)
	{
		this.RegsNd=RegsNd;
		this.MODEL=MODEL;
		this.Customer=Customer;
	}
	public void setRegsNd(String RegsNd)
	{
		this.RegsNd=RegsNd;
	}
	
	public void setMODEL(String MODEL)
	{
		this.MODEL=MODEL;
	}
	String getRegsNd()
	{
		return RegsNd;
	}
	String getMODEL()
	{
		return MODEL;
	}
	public void display()
	{
		Customer.details();
		System.out.println("registation number "+RegsNd);
		System.out.println("MODLE "+MODEL);
	}
	
}
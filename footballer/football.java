import java.lang.*;
public class football
{
	public String Footballer_name,Footballer_id,Footballer_age,Footballer_score;
	public football()
	{
		System.out.println("footballer bio");
	}
	public football( String Footballer_name,String Footballer_id,String Footballer_age,String Footballer_score)
	{
		this.Footballer_name=Footballer_name;
		this.Footballer_id=Footballer_id;
		this.Footballer_age=Footballer_age;	
		this.Footballer_score=Footballer_score;
	}
	String getFootballer_name()
	{
		return Footballer_name;
	}
	String getFootballer_id()
	{
		return Footballer_id;
	}
	String getFootballer_age()
	{
		return Footballer_age;
	}
	String getFootballer_score()
	{
		return Footballer_score;
	}	
	public void viewdetails()
	{
		System.out.println("FOOTBALLER NAME - "+Footballer_name+"\n"+"FOOTBALLER ID - "+Footballer_id+"\n"+"FOOTBALLER AGE - "+Footballer_age+"\n"+"FOOTBALLER SCORE - "+Footballer_score);
	}
}
import java.lang.*;
import java.util.Scanner;
public class GulshanB extends Restaurent
{
	public String BranchName,BranchId,Food;
	public GulshanB()
	{
		System.out.println("GULSHAN BRANCH");
	}
	public GulshanB(String Id,String Name,String BranchName,String BranchId,String Food)
	{
		super (Id,Name);
		this.BranchName=BranchName;
		this.BranchId=BranchId;
		this.Food=Food;
	}
	void setBranchName(String BranchName)
	{
		this.BranchName=BranchName;
	}
	void setBranchId(String BranchId)
	{
		this.BranchId=BranchId;
	}
	void setFood(String Food)
	{
		this.Food=Food;
	}
	String getBranchName()
	{
		return BranchName;
	}
	String getBranchId()
	{
		return BranchId;
	}
	String getFood()
	{
		return Food;
	}
	public void Details()
	{
		super.Details();
		System.out.println("BRANCH NAME - "+BranchName);
		System.out.println("BRANCH ID - "+BranchId);
		System.out.println("FOOD - "+Food);
	}
	
}
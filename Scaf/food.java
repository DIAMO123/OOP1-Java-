import java.lang.*;
import java.util.Scanner;
public class food
{
	public String Food_name;
	public int Food_ID;
	public String Quantity;
	public double Price;
	public food()
	{
		System.out.println("FOOD DETAILS");
	}
	public food (String Food_name,int Food_ID,String Quantity, double Price)
	{
		this.Food_name=Food_name;
		this. Food_ID= Food_ID;
		this.Quantity=Quantity;
		this.Price=Price;
	}
	String getFood_name()
	{
		return Food_name;
	}
	int getFood_ID()
	{
		return Food_ID ;
	}
	String getQuantity()
	{
		return Quantity;
	}
    double getPrice()
	{
		return Price;
	}
	void ViewDetails()
	{
		System.out.println("FOOD NAME - "+Food_name+"\n"+"FOOD ID - "+Food_ID+"\n"+"QUANTITY - "+Quantity+"\n"+"PRICE - "+Price);
	}
}
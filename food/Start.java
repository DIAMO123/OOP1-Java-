import java.lang.*;
import java.util.Scanner;
public class Start
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		String Food_name = obj.next();
		int Food_ID = obj.nextInt();
		String Quantity = obj.next();
		double Price = obj.nextDouble();
		
		
		food f = new food();
		food f1 = new food( Food_name, Food_ID, Quantity,  Price);
		f1.ViewDetails();
		
	}
}
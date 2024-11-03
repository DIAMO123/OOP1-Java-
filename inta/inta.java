import java.lang.*;
public class inta 
{
	public static void main (String[] args)
	{
		int ss =5,ss1=5;
		float ff = 66.66f,ff1=66.66f;
		
		System.out.println(ss);
		System.out.println(ff);
		System.out.println("implicit");
		
		ff=ss;
		System.out.println(ff);
		System.out.println("explisit");
	
		ss1=(int)ff1;
		System.out.println(ss1);
		
		
	}
} 
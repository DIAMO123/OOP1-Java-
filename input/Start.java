import java.lang.*;
import java.util.Scanner;
public class Start
{
public static void main(String[] args)
{
	Scanner ob=new Scanner(System.in);
	String Name=ob.next();
	String Varsity=ob.next();
	String Phone=ob.next();
	String Address=ob.next();
	int age=ob.nextInt();
	double cgpa=ob.nextDouble();
	input i=new input();
	input i1=new input(Name,Varsity,Phone,Address,age,cgpa);
	i1.Details();
	
}
}
import java.lang.*;
public class Start 
{
	public static void main(String[]  args)
	{
		
		
		teacher t = new teacher ();
		teacher t1 = new teacher ("Safi","dhaka","3472637863","Aiub");
		t1.ViewDetails1();
		t1.ViewDetails();
		
		
		student s = new student ();
		student s1= new student ("Diamond","kuril","BSc in CSE",3.62);
		s1.ViewDetails1();
		s1.ViewDetails();
	}
}
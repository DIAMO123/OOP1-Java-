import java.lang.*;
public class start
{
	public static void main(String[] args)
	{
		student s1=new student();
		student s2=new student("17-1-03","CSE","2nd","Avi",20,"22-46080-1","AB+");
		s2.viewDetailsST();
		s2.veiwdetailsPS();
		teacher t1=new teacher();
		teacher t2=new teacher("11-111-1","Science","one","Rupa",25,"17-1-98","A+");
		t2.viewDetailsTC();
		t2.veiwdetailsPS();
	}
	
}
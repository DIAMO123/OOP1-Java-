import java.lang.*;
public class Student
{
public String Id,Name,Phn;

public int Age;

public double CGPA;
public void setId(String Id,String Name,String Phn,int Age,double CGPA)
{
	this.Id=Id;
	this.Name=Name;
	this.Phn=Phn;
	this.Age=Age;
	this.CGPA=CGPA;
}
String getId()
{
return Id;
return Name;
return Phn;	
}
/*String getName()
{
return Name;	
}
String getPhn()
{
return Phn;	
}*/

int  getAge()
{
	return Age;
}

double  getCGPA()
{
	return CGPA;
	
}
void ViewDetails()
{
	System.out.println("NAME - "+Name);
	System.out.println("ID - "+Id);
	System.out.println("PHONE - "+Phn);
	System.out.println("AGE - "+Age);
	System.out.println("CGPA - "+CGPA);
}



public static void main(String[] args)
{
	Student S =new Student();
	
	S.setId("22-48152-2","Diamond","01302336667",22,3.62);
	
	
	
	
	S.ViewDetails();
}
}


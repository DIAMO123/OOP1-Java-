import java.lang.*;

import java.util.Scanner;

public class Start
{
	  public static void main(String[] args)
	  {
		  
		  Scanner obj=new Scanner(System.in);
		  System.out.println("Enter id");
		  String Id=obj.next();
		  System.out.println("Enter name");
		  String Name=obj.next();
		  System.out.println("Enter branch name");
		  String BranchName=obj.next();
		  System.out.println("Enter branch id");
		  String BranchId=obj.next();
		  System.out.println("Enter food name");
		  String Food=obj.next();
		  
		 
		  
		  GulshanB G=new GulshanB(Id,Name,BranchName,BranchId,Food);
		  G.Details();
		  
		  System.out.println("Enter id");
		  String Id1=obj.next();
		  System.out.println("Enter name");
		  String Name1=obj.next();
		  System.out.println("Enter branch name");
		  String BranchName1=obj.next();
		  System.out.println("Enter branch id");
		  String BranchId1=obj.next();
		  System.out.println("Enter food name");
		  String Food1=obj.next();
		  BananiB arr1[] = new BananiB [5];
		   
		  
		  BananiB B=new BananiB(Id1,Name1,BranchName1,BranchId1,Food1);
		  B.Details();
		  
		  
		  
	  }
	
}
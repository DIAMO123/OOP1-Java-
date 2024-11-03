import java.lang.*;
public class start
{
	public static void main(String[] args)
	{
		football f[]=new football[5];
		football f1=new football("player 1","3423545","23","45");
		football f2=new football("player 2","342343","32","56");
		football f3=new football("player 3","3434545","25","54");
		f[0]=f1;
		f[2]=f2;
		f[4]=f3;
		
		
		
		for(int i=0;i<f.length;i++)
		{
			if(f[i]!=null)
			{
				f[i].viewdetails();
			}
			else{System.out.println("Empty");}
		}
		
		
		football b1 =new football("xyz","123","23","50");
		for(int i=0;i<5;i++)
		{
			
			b1.viewdetails();
		}
		
		
	}
	
}
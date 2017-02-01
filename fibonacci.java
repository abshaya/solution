import java.lang.*;
import java.util.Scanner;
public class fibinacci
{
	public static void main(String[] args)
	{
               int n;
              System.out.println("\nenter a value:");
		Scanner sn=new Scanner(System.in);
		n=sn.nextInt();
		int int1=0,int2=1,temp;
		System.out.println(int1+"\n"+int2);
                System.out.println("Fibonacci series");
		for(int i=2;i<n;i++ )
		{
                 temp=int1+int2;
		 int1=int2;
	         int2=temp;          
                 System.out.println(temp);
             }
        }
  }
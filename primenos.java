import java.util.Scanner;
import java.lang.*;
import static java.lang.Math.ceil;
public class primenos
{
	public static void main(String[] args)
	{
            
                Scanner sn=new Scanner(System.in);
		int n,flag=0,int1,int2;		
		System.out.println("Enter interval:");
		int1=sn.nextInt();
		int2=sn.nextInt();
                System.out.printf("The prime numbers between %d and %d are:\n",int1,int2);
		for(n=int1+1;n<int2;n++)
		{
		flag=0;
		for(int i=2;i<=ceil(n/2);i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
                    ;		
		else
                    System.out.println(n+" ");
                }
			
	}
}


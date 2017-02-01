import java.util.Scanner;
import java.lang.*;
import static java.lang.Math.ceil;
public class primecheck
{
	public static void main(String[] args)
	{
            
                Scanner sn=new Scanner(System.in);
		int n,flag=0;	
		System.out.println("Enter number:");
		n=sn.nextInt();		
		for(int i=2;i<=ceil(n/2);i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==1)
                   System.out.printf("%d is not a prime number",n);
		else
                    System.out.printf("%d is a prime number",n);
                }
			
	}



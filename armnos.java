import java.util.Scanner;
import java.lang.*;
import static java.lang.Math.ceil;
public class armnos
{
	public static void main(String[] args)
	{
            
                Scanner sn=new Scanner(System.in);
		int n,temp,int1,int2;
                int rem,sum=0;
		System.out.println("Enter interval:");
		int1=sn.nextInt();
		int2=sn.nextInt();
                System.out.printf("The armstrong numbers between %d and %d are:\n",int1,int2);
		for(n=int1+1;n<int2;n++)
		{
                    temp=n;
                    sum=0;
                    while(temp!=0)
                    {
                         rem=temp%10;
                         temp=temp/10;
                         sum=sum+(rem*rem*rem);  
                    } 
                    
                            
                    if(n==sum)
                    System.out.println(n);
                }
               
			
	}
}


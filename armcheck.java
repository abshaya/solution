import java.util.Scanner;
import java.lang.*;
import static java.lang.Math.ceil;
public class armcheck
{
	public static void main(String[] args)
	{
            
                Scanner sn=new Scanner(System.in);
		int n,temp=0;
                int rem,sum=0;
		System.out.println("Enter number:");
		n=sn.nextInt();
		temp=n;
		
                    while(temp!=0)
                    {
                         rem=temp%10;
                         temp=temp/10;
                         sum=sum+(rem*rem*rem);  
                    } 
                    
                            
                    if(n==sum)
                    System.out.println("Armstrong number");
		    else
		    System.out.println("Not anArmstrong number");
                }
               
			
	}


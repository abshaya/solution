import java.util.Scanner;
import java.lang.StringBuffer;
public class oddnos
{
	public static void main(String[] args)
	{
            	int int1,int2;
                Scanner sn=new Scanner(System.in);
		System.out.println("Enter interval:");
		int1=sn.nextInt();
		int2=sn.nextInt();
		System.out.printf("The odd numbers between %d and %d are:\n",int1,int2);
		for(int i=int1+1;i<int2;i++)
		{
			if(i%2!=0)
                        {
                                System.out.println(i+" ");
                        }
				
		}
                     
                

			
	}
}

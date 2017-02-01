import java.util.Scanner;
import java.lang.*;
import static java.lang.Math.ceil;
public class multable
{
	public static void main(String[] args)
	{
            
                Scanner sn=new Scanner(System.in);
                int n,limit;
                System.out.println("Enter a number:");
                n=sn.nextInt();
                System.out.println("Enter the limit");
                limit=sn.nextInt();
                for(int i=1;i<=limit;i++)
                {
                    System.out.printf("%d X %d = %d\n",i,n,i*n);
                }
    }
}


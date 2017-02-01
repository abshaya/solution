import java.util.Scanner;
import java.lang.*;
import static java.lang.Math.ceil;
public class factorial
{
	public static void main(String[] args)
	{
            
                Scanner sn=new Scanner(System.in);
                int n;
                System.out.println("Enter a number:");
                n=sn.nextInt();
                System.out.println("Factorial of a number:"+fact(n));
        }

        private static int fact(int n) {
            if(n==1)
                return 1;
            else 
                return n*fact(n-1);
    }
}


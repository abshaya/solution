import java.lang.*;
import java.util.Scanner;
public class reverse
{
public static void main(String[] args)
{
Scanner sn=new Scnner(System.in);
n=sn.nextInt();
while(n!=0)
{
rem=n%10;
n=n/10;
sum=sum*10+rem;
}
System.out.println("Reverse number:"+sum);

}
}

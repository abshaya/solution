
import java.lang.*;
import java.util.Scanner;

public class Nsum
{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n,temp,sum=0;
        System.out.println("Enter N:");
        n=sn.nextInt();
        temp=n;
        if(temp<0)
            temp=temp*-1;
        while(temp>0)
        {
        sum=sum+(temp%10);
        temp=temp/10;
        }
        if(n<0)
        System.out.format("sum of number %d is %d",n,(sum*-1));
        else
             System.out.format("sum of number %d is %d",n,sum); 
}
           
}
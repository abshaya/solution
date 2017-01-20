
import java.lang.*;
import java.util.Scanner;

public class digitno
{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n,temp,count=0;
        n=sn.nextInt();
        if(n<0)
            n=n*-1;
        if(n==0)
            System.out.println("Zero is entered");
        while(n>0)
        {
        count++;
        n=n/10;
        }
        System.out.format("%d digits in the given number",count);
        
}
           
}
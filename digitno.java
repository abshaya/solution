import java.lang.*;
import java.util.Scanner;

public class digitno
{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n,count=0;
        n=sn.nextInt();
        while(n>0)
        {
        count++;
        n=n/10;
        }
        System.out.format("%d digits in the given number",count);
        
}
           
}
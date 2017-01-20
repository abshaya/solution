import java.lang.*;
import java.util.Scanner;

public class sum
{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n,sum=0;
        n=sn.nextInt();
        while(n>0)
        {
         sum+=n--;   
        }
        System.out.format("sum of natural numbers: %d",sum);
        
}
           
}
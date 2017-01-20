import java.lang.*;
import java.util.Scanner;

public class leapch
{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n;
        n=sn.nextInt();
        if(n%4==0)
            System.out.format("%d is leap year",n);
        else
           System.out.format("%d is not leap year",n);
        
}
           
}
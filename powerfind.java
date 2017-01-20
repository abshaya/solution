
import java.lang.*;
import java.util.Scanner;

public class palindrome
{
       
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int num,temp,sum=0,no=0,rem;
        System.out.println("Enter number:");
        num=sn.nextInt();
        temp=num;
        while(temp>0)
        {
            rem=temp%10;
            no=no*10+rem;
            temp=temp/10;
        }
        if(num==no)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
        
}
           
}
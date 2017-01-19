
import java.util.Scanner;

public class numchek
{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n;
        n=Integer.parseInt(sn.next());
        if(n%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
        
}
           
}
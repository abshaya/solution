import java.lang.*;
import java.util.Scanner;

public class numchek
{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int n;
        n=Integer.parseInt(sn.next());
        if(n>=0)
            System.out.println("positive");
        else
            System.out.println("Negative");
        
}
           
}
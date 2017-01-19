
import java.util.Scanner;

public class alphac
{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        char n;
        n=sn.next().charAt(0);
        if((65<=n&&n<=90)||(97<=n&&n<=122))
            System.out.format("%d",(int)n);
        else
            System.out.println("not an alphabet");
        
}
           
}
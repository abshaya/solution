
import java.util.Scanner;

public class alphachek
{
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        char n;
        n=sn.next().charAt(0);
        if(n=='A'||n=='a'||n=='E'||n=='e'||n=='I'||n=='i'||n=='O'||n=='o'||n=='U'||n=='u')
            System.out.println("Vowel");
        else if((65<n&&n<=90)||(97<n&&n<=122))
            System.out.format("%d",(int)n);
        else
            System.out.println("not an alphabet");
        
}
           
}
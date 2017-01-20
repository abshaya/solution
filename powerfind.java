
import java.lang.*;
import java.util.Scanner;

public class powerfind
{
    public static double basepower(float base,float power)
    {
        if(power>0)
            return base*basepower(base,--power);
        else
            return 1;
    }
       
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        float base,power;
        System.out.println("Enter number:");
        base=sn.nextFloat();
        System.out.println("Enter power:");
        power=sn.nextFloat();
        double val=basepower(base,power);
        System.out.format("%.3f power %.3f is %.3f",base,power,val);
        
}
           
}
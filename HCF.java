import java.lang.*;
import java.util.Scanner;
public class HCF
{
public static void main(String[] args)
{
Scanner sn=new Scanner(System.in);
int no1,no2,mul=0;
no1=sn.nextInt();
no2=sn.nextInt();
for(int i=1;i<no1||i<no2;i++)
{
	if(no1%i==0)
	{
		if(no2%i==0)
		{
			mul=i;
		
		}
	}
}
System.out.printf("HCF of %d and %d is:%d",no1,no2,mul);
}
}


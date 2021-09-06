import java.io.*;
import java.util.*;
class LastDigitNonZero
{
    public static int func(int num)
    {
        int fact1=1;
        for(int i=1;i<=num;i++)
        {
            fact1=fact1*i;
        }
        while(fact1%10==0)
        {
            fact1=fact1/10;
        }
        return fact1%10;
    }
 
	public static void main (String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   System.out.println(func(num));
	}
}
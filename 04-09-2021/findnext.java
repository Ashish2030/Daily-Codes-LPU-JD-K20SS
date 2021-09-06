import java.io.*;
import java.util.*;
class GFG 
{
    public static void func(String  num)
    {
     int n=num.length();
     int i=n-1;
     StringBuilder s=new StringBuilder(num);
     while(i>0 &&s.charAt(i)<=s.charAt(i-1) )
     {
         i--;
     }
     
     //--------------
     int j=i-1;
     int res=i;
     //---------------------
     if(j>=0)
     {
         while(i<n && s.charAt(i)>s.charAt(j))
         {
             if(s.charAt(i)<s.charAt(res))
             {
                 res=i;
             }
             i++;
         }
         char u=s.charAt(j);
         s.setCharAt(j,s.charAt(res));
         s.setCharAt(res,u);
         System.out.println(s);
         
     }
     else
     {
         System.out.println("Not Found");
     }
     
       
    }
 
	public static void main (String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   String num=sc.nextLine();
	   System.out.println(num);
	   func(num);
	}
}
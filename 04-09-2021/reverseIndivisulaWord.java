import java.io.*;
import java.util.*;
class reverseIndivisulaWord
{
    public static void func(String  num)
    {
        Stack<Character> st=new Stack<>();
       for(int i=0;i<num.length();i++)
       {
           if(num.charAt(i)!=' ')
           {
               st.push(num.charAt(i));
           }
           else
           {
               while(!st.isEmpty())
               {
                  System.out.print(st.pop()); 
               }
               System.out.print(" "); 
           }
       }
                 while(!st.isEmpty())
                  {
                      System.out.print(st.pop());
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
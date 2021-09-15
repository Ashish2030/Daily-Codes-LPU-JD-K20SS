import java.util.*;
class palindrome
{
    public static  boolean pall(String rev)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<rev.length();i++)
        {
            st.push(rev.charAt(i));
        }
        String reversed="";
        while(!st.isEmpty())
        {
            reversed=reversed+String.valueOf(st.pop());
        }
        if(reversed.equals(rev))
        {
            return true;
        }
        else
        {
            return false;
        }
    
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       String value=sc.nextLine();
       System.out.println(pall(value));
      
    }
}
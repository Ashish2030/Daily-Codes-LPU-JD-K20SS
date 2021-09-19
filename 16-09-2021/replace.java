import java.util.*;
class main 
{
    public static String func(String input)
    {
        Stack<Integer> st=new Stack<>(); 
        StringBuilder temp=new StringBuilder(input);
        for(int i=0;i<temp.length();i++)
        {
            if(temp.charAt(i)=='(')
            {
                st.push(i);
            }
            else if(temp.charAt(i)==')')
            {
                if(st.size()==0)
                {
                    temp.replace(i,i+1,"-1");
                }
                else
                {
                    temp.replace(i,i+1,"1");
                    temp.replace(st.peek(),st.peek()+1,"0");
                    st.pop();
                }
            }
            
        }
        while(!st.isEmpty())
        {
            int i=st.pop();
            temp.replace(i,i+1,"-1");
        }
        return temp.toString();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        System.out.println(func(input));
    }
}
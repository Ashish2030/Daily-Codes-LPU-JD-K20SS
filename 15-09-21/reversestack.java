import java.util.*;
class reversestack
{
    static Stack<Integer> st=new Stack<>();
    public static void insert(int val)
    {
        if(st.size()==0) // base 
        {
            st.push(val);
        }
        else
        {
            int  temp=st.pop();
            insert(val);
            st.push(temp);
            
            
        }
    }
    public static void remove()
    {
        if(st.size()==0)
        {
            return ;
        }
        int temp=st.pop();
        remove();
        insert(temp);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int times=sc.nextInt();
        while(times>0)
        {
            st.push(sc.nextInt());
            times--;
        }
        System.out.println(st);
        remove();
        System.out.println(st);
    }
}
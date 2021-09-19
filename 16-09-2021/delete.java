import java.util.*;
class main 
{
    public static void func(Stack<Integer> st,int mid,int count)
    {
        if(st.size()==0)
        {
            return ;
        }
        if(mid==count)
        {
            st.pop();
            return ;
        }
        int x=st.pop();
        func(st,mid,count+1);
        st.push(x);
        
    }
    public static void main(String args[])
    {
        Stack<Integer> st=new Stack<>();
        Scanner sc=new Scanner(System.in);
        int times=sc.nextInt();
        while(times>0)
        {
            st.push(sc.nextInt());
            times--;
            
        }
        int count=0;
        func(st,st.size()/2,count);
        System.out.println(st);
    }
}
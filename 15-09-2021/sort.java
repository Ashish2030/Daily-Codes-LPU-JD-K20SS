import java.util.*;
class sort
{
    static Stack<Integer> st=new Stack<>();
     static Stack<Integer> temp=new Stack<>();
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
        while(st.size()!=0)
        {
            int val=st.pop();
            while(temp.size()!=0&&val<temp.peek())
            {
                st.push(temp.pop());
            }
            temp.push(val);
        }
        System.out.println(temp);
    }
}
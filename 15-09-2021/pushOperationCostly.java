import java.util.*;
class pushOperationCostly
{
    static Queue<Integer> q1=new LinkedList<>();
        static  Queue<Integer> q2=new LinkedList<>();
    public static void push(int a)
    {
        
        q2.add(a);
        while(!q1.isEmpty())
        {
            q2.add(q1.remove());
        }
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }
    public static int pop()
    {
        return q1.remove();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int times=sc.nextInt();
        while(times>0)
        {
            push(sc.nextInt());
            times--;
        }
        System.out.println(pop());
          System.out.println(pop());
            System.out.println(pop());
              System.out.println(pop());
                System.out.println(pop());
    }
}
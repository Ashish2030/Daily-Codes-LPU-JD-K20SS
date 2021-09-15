import java.util.*;
class stackusingonlyonequeue
{
    static Queue<Integer> q1=new LinkedList<>();

    public static void push(int a)
    {
        int size=q1.size();
        q1.add(a);
        while(size>0)
        {
            q1.add(q1.remove());
            size--;
        }
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
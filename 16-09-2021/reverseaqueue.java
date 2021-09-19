import java.util.*;
class  main 
{
    static Queue<Integer> q1=new LinkedList<>();
    public static void func()
    {
        if(q1.isEmpty())
        return ;
        int x=q1.remove();
        func();
        q1.add(x);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         int times=sc.nextInt();
         while(times>0)
         {
             q1.add(sc.nextInt());
             times--;
         }
         func();
         System.out.println(q1);
    }
}
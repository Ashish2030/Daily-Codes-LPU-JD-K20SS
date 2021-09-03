import java.io.*;
import java.util.*;

class QueueLopp {

	public static void main (String[] args) 
	{
	    Queue<Integer> q=new LinkedList<>();
	    q.add(1);
	    q.add(2);
	    q.add(3);
	    
	   for(Integer x:q)
	   {
	       System.out.println(x);
	   }
	   
	    System.out.println(q.contains(1));
	   Iterator x1=q.iterator();
	   while(x1.hasNext())
	   {
	       System.out.println(x1.next());
	   }
	}
}
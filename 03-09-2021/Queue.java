import java.io.*;
import java.util.*;

class Queue {

		public static void main (String[] args) 
	{
	    Queue<Integer> q=new LinkedList<>();
	    q.add(1);
	    q.add(2);
	    q.add(3);
	    q.ofer(1);
	    System.out.println(q.peek());
	    System.out.println(q);
	    
	     System.out.println(q.remove());
	        System.out.println(q);
	        
	          System.out.println(q.poll());
	        System.out.println(q);
	        
	        System.out.println("size is"+q.size());
	}
}
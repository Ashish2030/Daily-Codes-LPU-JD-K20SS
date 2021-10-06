import java.io.*;
import java.lang.*;

class LinkedList {
   static  Node head;
   static class Node 
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    static  Node temp1=null;

    public static void push(int a)
    {
        Node temp=new Node(a);
        if(head==null)
        {
            head=temp;
            temp1=head;
        }
        else
        {
            temp1.next=temp;
            temp1=temp1.next;
        }
    }

    public static void printmiddle(Node head)
    {
       Node fast=head;
       Node slow=head;
       while(fast!=null && fast.next!=null)
       {
           fast=fast.next.next;
           slow=slow.next;
       }
       System.out.println(slow.data);
    }

	public static void main (String[] args) 
	{
	    int a[]={1,2,3,4,5,6};
	    for(int i=0;i<a.length;i++)
	    {
	        push(a[i]);
	    }
         printmiddle(head);
	  
	}
}
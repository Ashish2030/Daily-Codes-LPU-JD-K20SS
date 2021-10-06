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

    public static void print(Node head)
    {
        Node temp1=head;
        while(temp1!=null)
        {
            System.out.println(temp1.data);
            temp1=temp1.next;
        }
    }
    public static void deleteNode(Node c)
    {
        c.data=c.next.data;
        c.next=c.next.next;
    }
    
   
	public static void main (String[] args) 
	{
	    int a[]={1,2,3,4,5};
	    for(int i=0;i<a.length;i++)
	    {
	        push(a[i]);
	    }
	     print(head);
	    deleteNode(head.next.next);
	    print(head);
	  
	}
}
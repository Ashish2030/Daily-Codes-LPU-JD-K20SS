import java.io.*;
import java.util.*;

class GFG {
    
    public static void fun(int a[])
    {
        Stack<Integer>st=new Stack<>();
        int arr[]=new int[a.length];
        Arrays.fill(arr,-1);
        for(int i=0;i<a.length;i++)
        {
            while(!st.isEmpty() && a[st.peek()]<a[i])
            {
                arr[st.pop()]=a[i];
            }
            st.push(i);
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
	public static void main (String[] args) {
	    int a[]={1,2,3};
	    fun(a);

	}
}
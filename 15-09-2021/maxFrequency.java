import java.io.*;
import java.util.*;

class maxFrequency {
    public static int fun(int a[])
    {
        int max=1;
        int finalindex=0;
        int currentfrq=1;
        int currentnumber=a[0];
        for(int i=1;i<a.length;i++)
        {
            if(currentnumber==a[i])
            {
                currentfrq++;
                 if(currentfrq>max)
                {
                    max=currentfrq;
                    finalindex=i-1;
                }
            }
            else
            {
                currentfrq=1;
                currentnumber=a[i];
            }
            
        }
        
         System.out.println(a[finalindex]);
        return finalindex;
       
    }
	public static void main (String[] args) {
	    int a[]={2,2,3,4,4,6,9,10,10,10};
	    fun(a);
	
	}
}
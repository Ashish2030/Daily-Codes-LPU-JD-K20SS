import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Grains[] mv = new Grains[4];
        for(int i=0;i<4;i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String  c = sc.nextLine();
            int d = sc.nextInt();
            mv[i] = new Grains(a,b,c,d);
        }
        sc.nextLine();
        String nm = sc.nextLine();
        String m=sc.nextLine();
        int res = findTotalGrainsForGivenState(mv, nm);
        if (res>0)
        System.out.println(res);
        else
        System.out.println("No Grains available for the given state");
        Grains temp = getGrainsForGivenName(mv,m);
        if(temp == null)
        System.out.println("No Grains with matching names are found");
        else
        System.out.println(temp.id+"-"+m+"-"+temp.rt);

    }

    public static int findTotalGrainsForGivenState (Grains[] mv, String nm)
      {
          int avg,s=0,j=0;
          for(int i=0;i<4;i++)
          {           
              if(nm.equalsIgnoreCase(mv[i].rt))
              {
                  s = s+mv[i].bt;
                  j++;
              }
          }
              if(j>0)
              {
                 
                  return s;
              }          
              else 
              return 0;
      }

    public static Grains getGrainsForGivenName(Grains[] mv,String  budget)
      {
          Grains temp = new Grains();
          for(int i=0;i<4;i++)
          {
              if(budget.equalsIgnoreCase(mv[i].dt))
              {
                  temp= mv[i];
                  return temp;
              }
          }
          return null;   
          
      }
}

class Grains
{

    int id,bt;
    String dt,rt;
    Grains()
    {

    }
    Grains(int id, String dt,String rt, int bt)
    {
        this.id = id;
        this.dt = dt;
        this.rt = rt;
        this.bt = bt;
    }
}
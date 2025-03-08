import java.util.*;
public class NQuees
{
  static int[] x;
  public static boolean isplace(int k,int i)
  {
    for(int j=1;j<k;j++)
     {
       if(x[i]==j || Math.abs(x[j]-i) == Math.abs(j-k))
       {
         return false;
       }
     }
     return true;
  }
  public static void nquees(int k,int n)
  {
 
    if(k>n)
    {
      for(int i=1;i<=n;i++)
       {
         System.out.print(x[i]+" ");
       }
       System.out.println();
     }
     else
     {
      for(int i=1;i<=n;i++)
      {
        if(isplace(k,i))
        {
          x[k]=i;
          nquees(k+1,n);
        }
      }
     }
  }
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
  System.out.println("enter the no of queens");
  int n=sc.nextInt();
  x=new int[n+1];
  nquees(1,n);
  }
 }
  
            	

import java.util.*;
public class PatternPrint
{
    public static void RGTriangle(int n) 
    {
      
      for(int a=0;a<n;a++)
      {
          for(int b=0;b<=a;b++)
          {
            System.out.print("charu ");
          }
          System.out.println();
      }
      
      
    }
     public static void main(String args[])
     {
         int k=40;
         RGTriangle(k);
     }
}
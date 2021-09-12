import java.io.*;
public class Diamond_pattern
{
    public static void main(String args[])
    {
      int max=7;
      int a,b;//initializing row and column
      
      
      //loop for first half of diamond
      for( a=1;a<=max;a++)
      {
        for(b=1;b<=max-a;b++)
        {
            System.out.print(" ");
        }
        for (b=1;  b<=a*2-1;  b++)
        {
          System.out.print("c");
        }
          System.out.println( );
      }
      
      //loop for second half of diamond
      for(a=max-1; a>0; a--)
      {
        for(b=1;b<=max-a;b++)
        {
            System.out.print(" ");
        }
        for (b=1;  b<=a*2-1;  b++)
        {
          System.out.print("c");
        }
          System.out.println( );
      }
    }
}    
      
      
   
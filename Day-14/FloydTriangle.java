import java.util.*;
public class FloydTriangle
{
    public static void main(String args[])
    {
       int rows, num = 1, i, j;

       Scanner input = new Scanner(System.in);
       System.out.println("Enter the number of rows:\n");
       System.out.println();

       rows = input.nextInt();


       for ( i = 1 ; i<= rows ;i ++ )
       {
           for ( j = 1 ; j <= i ; j++ )
           {
                System.out.print(num+" ");

                num++;
           }

           //System.out.println();
       }
   }
}

import java.util.*;
public class MatrixAddition
{
    public static void main(String args[])
    {
        int row, col,i,j;
        Scanner s = new Scanner(System.in);
 
        System.out.println("Enter the number of rows");
        row = s.nextInt();
 
        System.out.println("Enter the number columns");
        col = s.nextInt();
 
        int m1[][] = new int[row][col];
        int m2[][] = new int[row][col];
        int result[][] = new int[row][col];
 
        System.out.println("Enter the elements of matrix1");
 
        for ( i= 0 ; i < row ; i++ )
        { 
 
            for ( j= 0 ; j < col ;j++ )
            m1[i][j] = s.nextInt();
 
            System.out.println();
        }
        System.out.println("Enter the elements of matrix2");
 
        for ( i= 0 ; i < row ; i++ )
        {
 
            for ( j= 0 ; j < col ;j++ )
            m2[i][j] = s.nextInt();
 
            System.out.println();
        }
 
        for ( i= 0 ; i < row ; i++ )
            for ( j= 0 ; j < col ;j++ )
        result[i][j] = m1[i][j] + m2[i][j] ; 
 
        System.out.println("Sum of matrices:");
 
        for ( i= 0 ; i < row ; i++ )
        { 
            for ( j= 0 ; j < col ;j++ )
        System.out.print(result[i][j]+"\t");
 
        System.out.println();
        }
 
     }
}
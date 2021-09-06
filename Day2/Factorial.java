import java.util.*;
public class Factorial 
{

    public static void main(String[] args) {

        
        long factorial = 1;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = s.nextInt();
        
        
        
        
        for(int i = 1; i <= num; ++i)
        {
            
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
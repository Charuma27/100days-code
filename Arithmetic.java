import java.util.*;
public class Arithmetic
{

    public static void main(String[] args) 
    {

        //int num1, num2;
        
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = s.nextInt();
        
        System.out.println("Enter second number:");
        int y = s.nextInt();
        
        int a=x+y;
        int b=x-y;
        int c=x*y;
        int d=x/y;
        System.out.println("The sum is"+ a);
        System.out.println("The subtraction is"+ b);
        System.out.println("The product is"+ c);
        System.out.println("The division is"+ d);
        
    }

}
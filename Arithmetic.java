import java.util.*;
public class Arithmetic
{

    public static void main(String[] args) 
    {

        //int num1, num2;
        
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = s.nextInt();
        
        System.out.println("Enter second number:");
        int num2 = s.nextInt();
        
        int sum=num1+num2;
        System.out.println("The sum is",+ sum);
        
        int sub=num1-num2;
        System.out.println("The subtraction is",+sub);
        
        int product=num1*num2;
        System.out.println("The product is",+product);
        
        int divide=num1/num2;
        System.out.println("The division is",+divide);
        
    }

}
import java.util.*;
public class calculator
{
    public static void main(String [] args)
    {   char choice;
        double Ans;
        
        
        Scanner s= new Scanner(System.in);
        
        
        System.out.println("choice: (+,-,*,/)");
        choice=s.next().charAt(0);
        
        System.out.println("Enter first number");
        double num1 = s.nextDouble();

        System.out.println("Enter second number");
        double num2 = s.nextDouble();
        
        switch (choice) 
        {

      
        case '+':
           Ans = num1 + num2;
           break;

      
        case '-':
           Ans = num1 - num2;
           break;

      
        case '*':
           Ans= num1 * num2;
           break;

      
        case '/':
           Ans = num1 / num2;
           break;

        default:
           System.out.println("Invalid operator!");
           return;
        }
        System.out.print("\nThe result is :\n");
        System.out.print(num1 + " " + choice + " " + num2 + " = " + Ans );
        
    }
    
}
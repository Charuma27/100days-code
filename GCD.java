import java.util.*;
public class GCD
{

    public static void main(String[] args)
    {

        int num1, num2;


        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = s.nextInt();

        System.out.print("Enter second number:");
        num2 = s.nextInt();


        while (num1 != num2)
        {
        	if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }


        System.out.printf("GCD of given numbers is: %d", num2);
    }

}
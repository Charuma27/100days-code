import java.util.*;
public class Reversed 
{

    public static void main(String[] args) {

        
        int reversed=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = s.nextInt();
        
        while(num != 0) 
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num/10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
import java.util.*;
public class ATM
{
    
    public static void main(String args[])
    
    
    
    {  
          
          System.out.println("*****************"+"WELCOME TO THE BANK OF INDIA"+"******************");
          int balance = 100000, withdraw,check_balance,pin_change,deposit;
          Scanner s=new Scanner(System.in);
          System.out.println("1. Withdraw ");
          System.out.println("2.Deposit");
          System.out.println("3. Check_balance");
          System.out.println("4. Pin_change");
          System.out.println("---------------------" +"Please select an option: " + "---------------------");
          
          
          int choice=s.nextInt();
          switch(choice)
          {
            case 1:
                System.out.println("Please enter an amount to withdraw:");
                withdraw = s.nextInt();
                
                if(balance>=withdraw)
                {
                    balance-=withdraw;
                    System.out.println("Please collect your money");
                }
                else
                {
                   System.out.println("Your account has insufficient balance");
                }
                break;
            
            case 2:
                System.out.println("Please enter an amount to be deposited:");
                deposit=s.nextInt();
                balance=balance+deposit;
                System.out.println("Your money has been successfully deposited");
                break;
                
            case 3:
                System.out.println("Your balance is " + balance);
                break;
                
            case 4:
                System.out.println("Please enter the old pin number: \n");
                int old_pin_change=s.nextInt();
                System.out.println("Please enter the new pin number: \n");
                int new_pin_change=s.nextInt();
                System.out.println("Please enter the OTP sent to you registered mobile number\n");
                int OTP=s.nextInt();
                System.out.println("Your pin number is successfully changed\n");
                break;
           }
          
    }
    
}
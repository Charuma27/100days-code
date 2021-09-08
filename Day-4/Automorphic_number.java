import java.util.*;
public class Automorphic
{
    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num= s.nextInt();
        int square=num*num;
        int count=0;
        int temp=num;
        int lastDigit;
        while(temp>0)
        {
            count++;
            temp=temp/10;
            
        }
        lastDigit = (int) (square%(Math.pow(10, count)));
        if(num==lastDigit)
        if(num == lastDigit)  
             System.out.println(num+ " is an automorphic number");  
        else  
             System.out.println(num+ " is not an automorphic number");  
    }  
}  
        

 
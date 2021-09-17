import java.util.*;  
public class Neonnumber  
{  
public static void main(String args[])  
{  
int num,sum = 0;      
Scanner s = new Scanner(System.in);  
System.out.print("Enter the number: ");  
num = s.nextInt();  
  
int square = num * num;  
  
while(square != 0)  
{  
     
int digit = square % 10;  
 
sum = sum + digit;  
  
square = square / 10;  
}  
  
if(num == sum)  
System.out.println(num + " is a Neon Number.");  
else  
System.out.println(num + " is not a Neon Number.");  
}  
}  
import java.util.*;
public class SquareRoot
{
	public static void main(String[] args)
    {
		System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("The square root of "+ n+ " is: "+squareRoot(n));
     }

     public static double squareRoot(int num)
     {
		 int x,sqrt=num/2;
		 do
		 {
			 x=sqrt;
			 sqrt=(x+(num/x))/2;
          }
          while((x-sqrt)!= 0);
          return sqrt;
      }
}
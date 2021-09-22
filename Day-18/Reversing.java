import java.util.*;
public class Reversing
{
	public static void main(String args[])
	{
		String sentance;
                Scanner in=new Scanner(System.in);
                System.out.print("Enter a String: ");
                sentance=in.nextLine();
                System.out.print("After reverse string is: ");

                int i=sentance.length();
                while(i>0)
                {
			System.out.print(sentance.charAt(i-1));
                        i--;

                }

         }
}

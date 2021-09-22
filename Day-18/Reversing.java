import java.util.*;
public class Reversing
{
	public static void main(String args[])
	{
		String w;
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a String: ");
        w=in.nextLine();
        System.out.print("After reverse string is: ");

        int i=w.length();
        while(i>0)
        {
			System.out.print(w.charAt(i-1));
            i--;

        }

    }
}
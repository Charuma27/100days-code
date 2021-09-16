import java.util.*;
public class Frequency
{
     public static void main(String[] args)
     {
        String str = "java is a programming language";
        int frequency[] = new int[str.length()];
        int i, j;


        char string[] = str.toCharArray();

        for(i = 0; i <str.length(); i++)
        {
            frequency[i] = 1;
            for(j = i+1; j <str.length(); j++)
            {
                if(string[i] == string[j])
                {
                    frequency[i]++;


                    string[j] = '0';
                }
            }
        }



        for(i = 0; i <frequency.length; i++)
        {
            if(string[i] != ' ' && string[i] != '0')
                System.out.println(string[i] + "-" + frequency[i]);
        }
    }
}
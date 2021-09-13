import java.util.*;
public class selectionsort
{
    public static void main(String [] args)
    {
        int i,j,length,temp;
        int arr [] = new int[50];
        
        Scanner s= new Scanner(System.in);
        System.out.print("Enter Array length : ");  
        length = s.nextInt();  
         
        System.out.print("Enter Array Elements : ");  
        for(i=0; i<length; i++)  
        {  
            arr[i] = s.nextInt();  
        }  
         
        System.out.print("Before sorting\n");  
        for(i=0; i<length; i++)  
        {  
           for(j=i+1; j<length; j++)  
           {  
               if(arr[i] > arr[j])  
               {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }  
           }  
        }  
         
        System.out.print(" After Sorting is :\n");  
        for(i=0; i<length; i++)  
        {  
           System.out.print(arr[i]+ "  ");  
        }  
    }  
        
}

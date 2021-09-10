import java.util.*;
public class binarySearch
{  
 public static void binarySearch(int arr[], int first, int last, int key)
 {  
   int mid = (first + last)/2;  
   while( first <= last )
   {  
      if ( arr[mid] < key )
      {  
        first = mid + 1;     
      }
      else if ( arr[mid] == key )
      {  
        System.out.println("Element is found at index: " + mid);  
        break;  
      }
      else
      {  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last )
   {  
      System.out.println("Element is not found");  
   }  
 }  
 public static void main(String args[])
 { 
    int n; 
    Scanner s= new Scanner(System.in);
    System.out.print("Enter the number of elements: ");  
    n=s.nextInt();  
    int[] arr = new int[10];  
    System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<n; i++)  
    {  
   
       arr[i]=s.nextInt();  
    }  
    System.out.println("Array elements are: ");  
    for (int i=0; i<n; i++)   
    {  
        System.out.println(arr[i]);  
    }
    System.out.println("Enter the search value:");
    int key =s.nextInt();
    int last=arr.length-1;  
    binarySearch(arr,0,last,key); 
    
 }
}
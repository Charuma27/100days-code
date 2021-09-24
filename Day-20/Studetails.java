import java.util.*;
public class Studetails
{
   String SName  ;
   int SID;
   String  SDept;
   Studetails()     //Default constructor
   {
       SName = "Kannan";
       SID = 100;
       SDept="CSE";
   }
   Studetails( String str1,int num1, String  str2)   //Parameterized constructor
   {
       SName = str1;
       SID = num1;
       SDept =str2;
   }
   public String getSName()
   {
       return SName;
   }
   public void setSName(String SName)
   {
       this.SName = SName;
   }

   public int getSID()
   {
       return SID;
   }
   public void setSID(int SID)
   {
       this.SID = SID;
   }

   public String getSDept()
   {
       return SDept;
   }
   public void setSDept(String SDept)
   {
       this.SDept = SDept;
   }

   public static void main(String args[])
   {

       Studetails obj = new Studetails();
       Studetails obj1 = new Studetails( "Raju",101,"CSE" );



       System.out.println("Student Name is: "+obj.getSName());
       System.out.println("Student Dept is: "+obj.getSDept());
       System.out.println("Student ID is: "+obj.getSID());

       System.out.println("Student Name is: "+obj1.getSName());
       System.out.println("Student Dept is: "+obj1.getSDept());
       System.out.println("Student ID is: "+obj1.getSID());
  }
}
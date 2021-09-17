import java.util.*;

class studentdetails
{

    int roll_no;
    String sname, cname;
    void input()
    {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter Roll Number: ");
		roll_no = s.nextInt();
		s.nextLine();
		System.out.print("Enter Name: ");
		sname = s.nextLine();
		System.out.print("Enter class: ");
		cname = s.nextLine();
	}
}
class student extends studentdetails
{
	void display()
    {
		System.out.println("/******* Student details printed ********/");
		System.out.println("Roll Number is: "+roll_no);
		System.out.println("Your name is: "+sname);
		System.out.println("Your class is: "+cname);
     }

      public static void main(String args[])
      {
		  student obj = new student();
		  obj.input();
		  obj.display();
	   }

}
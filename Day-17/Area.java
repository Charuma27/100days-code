import java.io.*;
class Figure
{
	double d1,d2;
	Figure(double a, double b)
	{
		d1=a;
		d2=b;
    }
    double area()
    {
		System.out.println("Area for figure is not defined:");
		return 0;
    }
}
 class Rectangle extends Figure
{
	Rectangle (double a,double b)
	{
		super(a,b);
    }
    double area()
    {
		System.out.println("Area of rectangle:");
		return d1*d2;
	}
}

class Area
{
	public static void main(String[] args)
	{
		Figure s = new Figure(5,5);
		Rectangle r= new Rectangle(3,6);

		Figure figref;

		figref=s;
		System.out.println("Area is"+ figref.area());
		System.out.println(" ");

		figref=r;
		System.out.println("Area  is"+ figref.area());
		System.out.println(" ");


	}
}







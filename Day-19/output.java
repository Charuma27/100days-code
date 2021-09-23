//import java.io.*;
//import java.util.*;
interface cuboid
{
	public void volcuboid();
}
interface cube
{
	public void volcube();
}

class volume implements cuboid,cube
{

   public void volcuboid()
   {
		  int length=10;
		  int breadth=20;
		  int height=15;
		  int volume=length*breadth*height;
   	      System.out.println("The volume of cuboid:"+volume);
   	      System.out.println();
    }
    public void volcube()
    {
		int side=15;
   	    int volume=side*side*side;
   	    System.out.println("The volume of cube:"+volume);
   	    System.out.println();
    }
}

class output
{
	public static void main(String []args)
	{
		volume v = new volume();
        v.volcuboid();
        v.volcube();
     }
}


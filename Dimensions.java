import java.util.Scanner;

public class Dimensions{

public static void main(String args[])
{
float length,breadth,height,radius,areacircle,areatriangle,arearectangle;
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of length,breadth,height and radius:");
length=sc.nextFloat();
breadth=sc.nextFloat();
height=sc.nextFloat();
radius=sc.nextFloat();
areacircle=3.14f*(radius*radius);
areatriangle=(height*breadth)/2;
arearectangle=length*breadth;
System.out.println("the area of a rectangle:"+arearectangle);
System.out.println("the area of a triangle:"+areatriangle);
System.out.println("the area of a circle:"+areacircle);

}
}

import java.util.Scanner;

public class DimensionsClassObject {
	int l,b,a=7;
	double r;
	public void square()
	{
		System.out.println("Area of a square:"+(a*a));

	}
	public int rectangle(int l,int b)
	{
return l*b;   
	}
	public void circle(double r)
	{
		System.out.println("Area of a circle:"+(3.14*r*r));
	}
	public double triangle(double b,double h)
	{
double a=0.5*b*h;
return a;
	}
	static {
		System.out.println("Dimensions for area of  rectangle,square,triangle,circle");

	}
	public static void main(String args[])
	{
		int l,b,res;
		double r,le,br;
		DimensionsClassObject obj=new DimensionsClassObject();
		obj.square();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers for length and breadth:");
		l=sc.nextInt();
		b=sc.nextInt();
		res=obj.rectangle(l,b);
		System.out.println("Area of a rectangle:"+res);

		System.out.println("Enter the number for radius:");
		r=sc.nextDouble();
		obj.circle(r);
		System.out.println("Enter the numbers for triangle:");
		le=sc.nextDouble();
		br=sc.nextDouble();
		double tot=obj.triangle(le,br);
		System.out.println("Areaof a triangle:"+tot);
	}

}

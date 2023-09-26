
public class paramaterizedMethodEx {
	public static void rectangle(int l,int b)
	{
		System.out.println("Area of a rectangle:"+(l*b));
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
		System.out.println("invoke before main()at the time of class loading");

	}
	

}

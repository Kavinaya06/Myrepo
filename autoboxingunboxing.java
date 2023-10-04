package abstraction;

public class autoboxingunboxing {
	public static void main(String args[])
	{
		int a=10;
		Integer obj=10;
		System.out.println(obj);
		Integer obj2=Integer.valueOf(a);//prior java5
		System.out.println(obj+" "+obj2);

		//unboxing
		Integer i=30;
		int b=i;
		int c=i.intValue();//prior java5
	System.out.println(b+" "+c);
	}

}

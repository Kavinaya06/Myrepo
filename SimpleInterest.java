import java.util.Scanner;

public class SimpleInterest {
	public static void main(String[] args)
	{
		float p,n,r,si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle,number of years and rate of interest:");
		p=sc.nextFloat();
		n=sc.nextFloat();
		r=sc.nextFloat();
		si=(p*n*r)/100;
        System.out.println("the required simple interest is  "+si);

	}
	

}

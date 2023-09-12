import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String args[])
	{
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number to check whether it is positive,negative and zero:");
		n=sc.nextInt();
		if(n==0)
			System.out.println("Zero");
		else if(n>0)
			System.out.println("positive");
		else
			System.out.println("negative");


			
	}

}

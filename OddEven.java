import java.util.Scanner;

public class OddEven{
	public static void main(String[] args)
	
	{
		int a;
		System.out.println("enter number to check whether it is odd or even:");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		if((a%2==0)||a==0)
		{
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}
	}

}

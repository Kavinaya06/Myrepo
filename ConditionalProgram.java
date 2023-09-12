import java.util.Scanner;

public class ConditionalProgram {
	public static void main(String[] args)
	
	{
		int a;
		System.out.println("enter your age:");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		if(a>=18)
		{
			System.out.println("eligible for driving");
	
		}
		else {
		System.out.println("ineligible for driving");
		}
	}

}

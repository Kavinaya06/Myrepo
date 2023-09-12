import java.util.Scanner;

public class PhoneBill{
	public static void main(String[] args)
	
	{
		int calls;
		System.out.println("enter number of calls to get the bill amount:");
		Scanner sc= new Scanner(System.in);
		calls=sc.nextInt();
		if(calls<=200)
			System.out.println("the required bill amount is Rs: "+calls*1);
		else {
			System.out.println("the required bill amount is Rs: "+calls*3);
		}
	}

}


import java.util.Scanner;

public class GreatestNumber {
	public static void main(String[] args)
	
	{
	int n1,n2,n3;
		System.out.println("enter three numbers:");
		Scanner sc= new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		if(n1>n2&&n1>n3)
			System.out.println("the value of "+ n1 +"is greater");
		else if(n2>n1&&n2>n3)
			System.out.println("the value of "+ n2 +"is greater");
		else 
			System.out.println("the value of "+ n3 +"is greater");


		}
	}

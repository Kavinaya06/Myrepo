import java.util.Scanner;

public class primeObjectClass {
	int n,flag=0;
	void accept()
	{
		System.out.println("To check a number is prime or not:");
	
	}
	void prime()
	{
		System.out.println("Enter a number:");
		Scanner sc=new Scanner(System.in);
           n=sc.nextInt();
		if(n==0||n==1)
		{
			System.out.println(" 1 and 0 are Composite number ");

		}
		else
		{
		for(int i=2;i<=n/2;i++)
		{
			if (n%i==0)
			{
				System.out.println("Not a prime number");
               flag=1;
                break;
			}
		}
		}
		if(flag==0)
			System.out.println("prime number");
	

			
	}
public static void main(String args[])
{
	primeObjectClass obj= new primeObjectClass();
	obj.accept();
	obj.prime();
}
}

import java.util.Scanner;

public class defaultMethodEx {
	int a,b;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
	public void add()
	{
		System.out.println("Add:"+(a+b));

	}
	public int sub()
		{
			int c=a-b;
			return c;
			
		}
	}



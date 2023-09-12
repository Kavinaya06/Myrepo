import java.util.Scanner;
public class TaxWithIfClause {
	public static void main(String[] args)
	
	{
		float tax, salary;
		System.out.println("enter the salary:");
		Scanner sc= new Scanner(System.in);
		salary=sc.nextInt();
		if(salary<25000)
		{
			System.out.println("The required tax amount is :"+salary*0.1);
		}
		
		else {
			System.out.println("The required tax amount is :"+salary*0.15);

		}
	}

}


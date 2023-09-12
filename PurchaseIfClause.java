import java.util.Scanner;
public class PurchaseIfClause {
	public static void main(String[] args)
	
	{
	float purchase;
		System.out.println("enter your purchase value inorder to get discount:");
		Scanner sc= new Scanner(System.in);
		purchase=sc.nextInt();
		if(purchase>=10000)
		{
			System.out.println("The required tax amount is :"+purchase*0.1);
		}
		
		else {
			System.out.println("The required tax amount is :"+purchase*0.02);

		}
	}

}


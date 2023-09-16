import java.util.Scanner;

public class ArrayEx6 {
	public static void main(String args[])
	{
		int i,sum=0,prod=1;
		System.out.println("Enter the size of array elements:");

		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int b[]=new int[size];
		
		System.out.println("Enter the  array elements:");
		for(i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
		}	
		System.out.println("array ofsum of even number and product of odd numbers are: ");

		for(i=0;i<size;i++)
		{
		if(b[i]%2==0)
			sum=sum+b[i];
		else
			prod=prod*b[i];
			
		}
		System.out.println("array of sum is:" +sum);
		System.out.println("array of prod is:" +prod);

	

	}
}

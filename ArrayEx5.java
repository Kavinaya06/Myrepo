import java.util.Scanner;

public class ArrayEx5 {
	public static void main(String args[])
	{
		int i,sum=0;
		System.out.println("Enter the size of array elements:");

		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int b[]=new int[size];
		
		System.out.println("Enter the  array elements:");
		for(i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
		}	
		System.out.println("array of even number is: ");

		for(i=0;i<size;i++)
		{
		if(b[i]%2==0)
			System.out.print(b[i]+"\t");
		}
			

	}
}

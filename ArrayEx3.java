import java.util.Scanner;

public class ArrayEx3 {
	public static void main(String args[])
	{
		int i,sum=0;
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("Enter "+size+" array elements:");
		for(i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
			sum=sum +b[i];
			

		}
			System.out.println("array of sum is:" +sum);
			

		
		

	}
}

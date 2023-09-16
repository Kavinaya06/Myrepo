import java.util.Scanner;

public class ArrayEx8 {
	public static void main(String args[])
	{
		int i,large=0,small=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array elements:");

		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("Enter "+size+" array elements:");
		for(i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
			if (b[i]>large)
			{
				large=b[i];
			}
		}
		for(i=0;i<size;i++)
		{
			 if(b[i]<b[0])
			{
			b[0]=b[i];
			}
		}
		System.out.println("the largest number is:" +large);
		System.out.println("the smallest number is:" +b[0]);
}
}

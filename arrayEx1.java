import java.util.Scanner;

public class arrayEx1 {
	public static void main(String args[])
	{
		int []a= {1,2,3,4,5};
		int i;
		
		for (i=0;i<a.length;i++)
			System.out.println(a[i]);
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("Enter "+size+"array elements:");
		for(i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
		}
			System.out.println("array:");
			for(i=0;i<size;i++)
			{
				System.out.println(b[i]);

			}

		
		

	}
}

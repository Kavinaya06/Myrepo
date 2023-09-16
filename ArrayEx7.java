import java.util.Scanner;

public class ArrayEx7 {
	public static void main(String args[])
	{
		int i,o=0,e=0,z=0,sum=0,sum1=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array elements:");

		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("Enter "+size+" array elements:");
		for(i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
			if (b[i]%2==0)
			{
				sum=sum+b[i];
				e++;
			}
			else if(b[i]%2!=0)
			{
				sum1=sum1+b[i];
				o++;
			}
			else
				z++;

		}
		double avgeven=sum/size;
		double avgodd=sum1/size;

			System.out.println("the average  of even is:" +avgeven);
			System.out.println("the average  of odd is:" +avgodd);
}
}

import java.util.Scanner;

public class ArrayEx4 {
	public static void main(String args[])
	{
		int i,p=0,n=0,z=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array elements:");

		int size=sc.nextInt();
		int b[]=new int[size];
		System.out.println("Enter "+size+" array elements:");
		for(i=0;i<size;i++)
		{
			b[i]=sc.nextInt();
			if (b[i]>0)
				p++;
			else if(b[i]<0)
				n++;
			else
				z++;

		}
			System.out.println("frequency array of positive is:" +p);
			System.out.println("frequency array of negative is:" +n);
             System.out.println("frequency array of zero is:" +z);
}
}

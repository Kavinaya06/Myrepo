import java.util.Scanner;

public class ArraymEX12{
	public static void main(String args[])
	{
		/*int a[][]= {{1,2,3},{6,4,5}};
		int i,j;
		
		for (i=0;i<2;i++)
		{
			for (j=0;j<3;j++)
			{
			System.out.print(a[i][j]+"\t");
			}
			System.out.println();

		
		}
		*/
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array row and coloumn size:");

		int size1=sc.nextInt();
		int size2=sc.nextInt();
		int b[][]=new int[size1][size2];

		System.out.println("Enter "+size1+" array elements and "+size2+":");
		for(i=0;i<size1;i++)
		{
			for(j=0;j<size2;j++)
			{
			b[i][j]=sc.nextInt();
		}
		}
			System.out.println("array:");
			for(i=0;i<size1;i++)
			{
				for(j=0;j<size2;j++)
				{
				System.out.print(b[i][j]+"\t");
				}
				System.out.println();

				
			}

		
		}
	}
	

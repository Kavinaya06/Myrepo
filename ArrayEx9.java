import java.util.Scanner;

public class ArrayEx9 {
	public static void main(String args[])
	{
int rollNo[]= {1,2,3,4,5};
int marks[]= {65,58,89,42,76};
int i,j,temp1,temp2;
for(i=0;i<rollNo.length-1;i++)
{
	for(j=i+1;j<rollNo.length;j++)
	{
		if(marks[i]<marks[j])
		{
			temp1=marks[i];
			marks[i]=marks[j];
			marks[j]=temp1;
			
			temp2=rollNo[i];
			rollNo[i]=rollNo[j];
			rollNo[j]=temp2;
		}
	}

}
System.out.println("Roll No:");
for(i=0;i<rollNo.length;i++)
	System.out.print(" "+rollNo[i]);

System.out.println("Marks:");
for(i=0;i<marks.length;i++)
	System.out.print(" "+marks[i]);
/*Scanner sc=new Scanner(System.in);
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
		System.out.println("the smallest number is:" +b[0]);*/
}
}

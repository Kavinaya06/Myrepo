import java.util.Scanner;

public class ArrayEx10 {
	public static void main(String args[])
	{

int i,j,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array elements:");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("Enter "+size+" array elements:");
for(i=0;i<size;i++)
{
	a[i]=sc.nextInt();

}
for(i=0;i<size;i++)
{
	
	for(j=i+1;j<size;j++)

	{
		if(a[i]>a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
}
System.out.println(" the sorted acending array is");
for(i=0;i<size;i++)
{
	System.out.print(a[i]+"\t");
	
}

	}
}



import java.util.Scanner;

public class ArrayEx11 {
	public static void main(String args[])
	{

int i,j,temp1,temp2;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array elements:");
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("Enter "+size+" array elements:");
for(i=0;i<size;i++)
{
	a[i]=sc.nextInt();
}
for(i=0;i<(size/2)-1;i++)
{
	for (j=i+1;j<size/2;j++)
	{
		if(a[i]>a[j])
		{
		temp1=a[i];
		a[i]=a[j];
		a[j]=temp1;
		}
	} 
}
System.out.print(" the ascending order of first half elemetns:");
for(i=0;i<size/2;i++)
{
	System.out.print(a[i]+"\t");
	
}
System.out.println();

for(i=size/2;i<size;i++)
{
	for (j=i+1;j<size;j++)
	{
		if(a[i]<a[j])
		{
		temp1=a[i];
		a[i]=a[j];
		a[j]=temp1;
		}
	} 
}
System.out.print(" the descending order of first half elemetns:");
for(i=size/2;i<size;i++)
{
	System.out.print(a[i]+"\t");
	
}
	}
}
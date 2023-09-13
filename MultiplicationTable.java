import java.util.Scanner;

public class MultiplicationTable {
public static void main(String args[])
{
int i,table,count=10,ans;
System.out.println("enter the table to be printed:");
Scanner sc=new Scanner(System.in);
table=sc.nextInt();
for (i=1;i<=count;i++)
{
	ans=table*i;
	System.out.println(" "+i+" * "+table+"= "+ans);

}
}
}


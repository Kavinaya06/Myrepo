import java.util.Scanner;
public class FinboacciNumber{
	public static void main(String args[])
	{
	int second=1,first=0,third,n,i;
	System.out.println("enter the fibnoacci number to be printed:");
	System.out.println("");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	System.out.println(first+" "+second);
	for(i=2;i<=n;i++)
	{
		third=first+second;
		System.out.println(""+third);
		first= second;
		second= third;
	}
}
}
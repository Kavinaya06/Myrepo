import java.util.Scanner;

public class FactorialNumber {	
public static void main(String args[])
{
int i,fact=1,n;
System.out.println("enter the factorial number:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for (i=1;i<=n;i++)
{fact=fact*i;
}
System.out.println("the factorial number of "+n+ "is :"+ fact);
}
}
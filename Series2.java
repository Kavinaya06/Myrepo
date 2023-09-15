import java.util.Scanner;

public class Series2 {
public static void main(String args[])
{
	
double sum=0,count;
System.out.println("enter count: ");
Scanner sc=new Scanner(System.in);
count=sc.nextDouble();
for(double i=1;i<=count;i++)
{
	sum=sum+1/i;
System.out.println("1/"+i);
if(i<10)
	System.out.println(" + ");
}
System.out.println(" = "+sum);

}
}

import java.util.Scanner;

public class Series4 {
public static void main(String args[])
{
	
double sum=0,count,square;
System.out.println("enter count: ");
Scanner sc=new Scanner(System.in);
count=sc.nextDouble();
for(double i=1;i<=count;i++)
{
	square=i*i;
	sum=sum+i/square;
System.out.println(i+"/"+square);
if(i<10)
	System.out.println(" + ");
}
System.out.println(" = "+sum);

}
}

import java.util.Scanner;

public class Series8 {
public static void main(String args[])
{
	
double sum=0,count,fract;
System.out.println("enter count: ");
Scanner sc=new Scanner(System.in);
count=sc.nextDouble();
for(double i=1;i<=count;i++)
{
	
	sum=sum+i*(i+1);
System.out.println(i+"*"+(i+1));
if(i<10)
	System.out.println(" + ");
}
System.out.println(" = "+sum);

}
}

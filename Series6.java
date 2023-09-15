import java.util.Scanner;

public class Series6 {
public static void main(String args[])
{
	
double sum=0,count,fract;
System.out.println("enter count: ");
Scanner sc=new Scanner(System.in);
count=sc.nextDouble();
for(double i=1;i<=count;i++)
{
	fract=i/i;
	sum=sum+i/fract;
System.out.println(i+"/"+i);
if(i<10)
	System.out.println(" + ");
}
System.out.println(" = "+sum);

}
}

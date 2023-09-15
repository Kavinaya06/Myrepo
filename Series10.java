import java.util.Scanner;

public class Series10 {
public static void main(String args[])
{
	
double sum=0,count,fact=1;
System.out.println("enter count: ");
Scanner sc=new Scanner(System.in);
count=sc.nextDouble();
for(double i=1;i<=count;i++)
{
	fact=fact*i;
	sum=sum+(i/fact);
System.out.println(i+"/"+i+"!");

if(i<10)
	System.out.println(" + ");
}
System.out.println(" = "+sum);

}
}


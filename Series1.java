import java.util.Scanner;
public class Series1 {
public static void main(String args[]){
	double sum=0,count;
System.out.println("enter count: ");
Scanner sc=new Scanner(System.in);
count=sc.nextDouble();
for(double i=1;i<=count;i++)
{
	if(i%2!=0)
	{
		sum=sum+i;
		System.out.println(i);
	}
if(i<10)
	System.out.println("");
}
System.out.println("= "+sum);

}
}

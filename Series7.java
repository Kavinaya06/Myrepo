import java.util.Scanner;
public class Series7 {
public static void main(String args[]){
	double square=0,count,sum=0;
System.out.println("enter count: ");
Scanner sc=new Scanner(System.in);
count=sc.nextDouble();
for(double i=1;i<=count;i++)
{
        square=i*i;
        sum=sum+square;
		System.out.println(square);
	
if(i<count)
	System.out.println("");
}
System.out.println("= "+sum);

}
}
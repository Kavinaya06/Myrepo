import java.util.Scanner;
public class Series3 {
public static void main(String args[]){
	double cube=0,count,sum=0;
System.out.println("enter count: ");
Scanner sc=new Scanner(System.in);
count=sc.nextDouble();
for(double i=1;i<=count;i++)
{
        cube=i*i*i;
        sum=sum+cube;
		System.out.println(cube);
	
if(i<count)
	System.out.println("");
}
System.out.println("= "+sum);

}
}
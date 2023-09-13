import java.util.Scanner;
public class DoWhilleLoop {
	
public static void main(String args[])
{
int a,b,c;
char ch;
Scanner sc=new Scanner(System.in);
do {
	System.out.println("enter two numbers:");
a=sc.nextInt();
b=sc.nextInt();
c=a+b;
System.out.println("adition::"+c);
System.out.println("Press y for continue:");
ch=sc.next().charAt(0);
}while(ch=='Y'||ch=='y');



}
}
import java.util.Scanner;

public class Marks{
public static void main(String args[])
{
float m1,m2,m3,d;
Scanner sc=new Scanner(System.in);
System.out.println("enter two numbers:");
m1=sc.nextFloat();
m2=sc.nextFloat();
m3=sc.nextFloat();
d=(m1+m2+m3)/3;
System.out.println("enter the marks of 3 subjects: ");
System.out.println("the percentage of 3 marks is :"+d);
}
}

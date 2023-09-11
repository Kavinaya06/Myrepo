import java.util.Scanner;

public class Tax{



public static void main(String args[])
{
float salary,tax;
Scanner sc=new Scanner(System.in);
System.out.println("enter salary:");
salary=sc.nextFloat();
tax=salary*0.12f;
System.out.println("Tax amount: "+tax);



}
}

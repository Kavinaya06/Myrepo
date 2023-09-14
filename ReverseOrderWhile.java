import java.util.Scanner;
public class ReverseOrderWhile {
public  static void main(String args[])
			{
				int n,rev=0,rem=0;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter any number:");
				n=sc.nextInt();
			while(n>0)
			{
				rem=n%10;
				rev=rem+(rev*10);
				n=n/10;
			}
			System.out.println("the required answer is :"+rev);

			}
			}


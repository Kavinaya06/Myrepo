

	import java.util.Scanner;
	public class Palindrome {
	public  static void main(String args[])
				{
					int n,temp,sum=0,rem;
					Scanner sc=new Scanner(System.in);
					System.out.println("enter any number:");
					n=sc.nextInt();
					temp=n;
				while(n>0)
				{
					rem=n%10;
					sum=rem+(sum*10);
					n=n/10;
				}
if(temp==sum)
	System.out.println("Palindrome number");
else
	System.out.println(" not Palindrome number");


				}
				}


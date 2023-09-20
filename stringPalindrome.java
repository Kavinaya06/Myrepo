
import java.util.Scanner;

public class stringPalindrome {
	public static void main(String args[]) {
		String str,revstr="";
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a string:");
		str=sc.nextLine();
		System.out.println("the required string got from input is: "+str);
		int length=str.length();
		int i;
		for(i=length-1;i>=0;i-- )
		{
		revstr=revstr+str.charAt(i);
		}
		if(str.toLowerCase().equals(revstr.toLowerCase()))
		{
			System.out.println("string is a palindrome");

		}
		else
			System.out.println("string is not  a palindrome");

	}
}

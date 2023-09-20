
import java.util.Scanner;

public class stringReplace {
	public static void main(String args[]) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a string:");
		str=sc.nextLine();
		System.out.println("the required string got from input is: "+str);
		System.out.println(str.replace("l","a"));

	}

}


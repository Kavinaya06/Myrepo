import java.util.Scanner;

public class StringCount {
	public static void main(String args[]) {
		String str;
		char ch;
		int count = 0, specialch = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a string:");
		str = sc.nextLine();
		System.out.println("the required string got from input is: " + str);
		System.out.println("ENter a character to count:");
		ch = sc.next().charAt(0);
		int length = str.length();
		for (int i = 0; i < length; i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				if (str.charAt(i) == ch)
					count++;
				else
					continue;
			} else if (str.charAt(i) == ' ')
				specialch++;
		}
		System.out.println("The required " + ch + " in a given input  and the count is : " + count);

	}

}

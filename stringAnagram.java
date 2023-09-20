import java.util.Arrays;
import java.util.Scanner;
public class stringAnagram {
public static void main(String args[]) {
		String str1,str2;
		boolean result;
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter two string:");
		str1 = sc.nextLine();
		str2 = sc.nextLine();

		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		System.out.println("the required string got from input is: " + str1+"  "+str2);
		if(str1.length()==str2.length())
		{
			char charArray1[]=str1.toCharArray();
			char charArray2[]=str2.toCharArray();
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			result =Arrays.equals(charArray1,charArray2);
			if(result==true)
				System.out.println("string is an anagram");
			else
				System.out.println("string is an anagram");

		}
		else
			System.out.println("string is an anagram");

			
}
}

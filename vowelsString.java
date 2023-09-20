import java.util.Scanner;

public class vowelsString {
	public static void main(String args[]) {
		String str;
		int vowels=0,consonants=0,specialch=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a string:");
		str=sc.nextLine();
		System.out.println("the required string got from input is: "+str);
int length=str.length();
for(int i=0;i<length;i++)
{
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
	{
		vowels++;
	}
	else if(str.charAt(i)>='a'&&str.charAt(i)<='z')
	{
		consonants++;
	}
	else
		specialch++;
	}
System.out.println("The required vowel in a given input is : "+vowels);
System.out.println("The required consonants in a given input is : "+consonants);
System.out.println("The required special characters in a given input is : "+specialch);


	}

}

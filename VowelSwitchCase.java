import java.util.Scanner;

public class VowelSwitchCase {
public static void main(String[] args)
	{
		char choice;
		System.out.println("enter any letter to check whether it is vowel or constant:");
		Scanner sc=new Scanner(System.in);
		choice=sc.next().charAt(0);
		switch(choice){
		case 'a':
		case'e':
		case 'i':
		case'o':
		case 'u':
			System.out.println(choice+"is the vowel");
		break;
		default:
			System.out.println(choice+"is not the vowel");

			}	
	}
}

import java.util.Scanner;

public class SwitchCaseEx{
	public static void main(String[] args)
	
	{
		int a,b;
		char choice;
		System.out.println("enter two  numbers :");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter your choice:\n + for addition \n - for subtraction \n * for multiplication \n / for division");
		choice=sc.next().charAt(0);
		switch(choice){
		case '+':
		    System.out.println("ADD:"+(a+b));
			break;
		case'-':
			System.out.println("SUB:"+(a-b));
			break;
		case'*':
			System.out.println("MUL:"+(a*b));
			break;
		case'/':
			System.out.println("DIV:"+(a/b));
			break;
		default:
			System.out.println("invalid choice");
			
	}	
			
	}

}

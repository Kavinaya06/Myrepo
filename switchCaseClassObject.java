import java.util.Scanner;

public class switchCaseClassObject
{int n,i,sum=0,rem;
	public void eligible()
	{
		System.out.println("Enter a number eligible for voting:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(i>n)
			System.out.println("eligible for voting");
		else
			System.out.println("eligible for not voting");
	}
	public void checknum()
	{
		System.out.println("Enter a number to check positive,negative or zero");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
			System.out.println("positive number");
		else if(n<0)
			System.out.println("negative number");
		else
			System.out.println("number is zero");
	}
	public void oddEven()
	{
		System.out.println("Enter a number to check odd,even or zero");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
			System.out.println("even number");
		else if(n%2!=0)
			System.out.println("odd number");
		else
			System.out.println("number is zero");
	}
	public void amstrongno()
	{
		int sum=0,rem=1,temp;
		System.out.println("Enter a number to check as amstron no");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("number is amstrong number");
		else
			System.out.println("number is not amstrong number");

	}
	public void palindrome()
	{
		int sum=0,rem=1,temp;
		System.out.println("Enter a number to check as palindrome no");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			rem=n%10;
			sum=rem+(sum*10);
			n=n/10;
		}
		if(temp==sum)
			System.out.println("number is palindrome number");
		else
			System.out.println("number is not palindrome number");

	}
public static void main(String args[])
{
	int choice;
    switchCaseClassObject m=new switchCaseClassObject();
    Scanner sc=new Scanner(System.in);
     char ch;
do {
	System.out.println("1.Eligible voting \n2.positive,negative and zero\n3.check odd or even\n4.Amstrong number\n5.palindrome number ");
	System.out.println("\nEnter a choice:");
    choice=sc.nextInt();
    switch(choice)
    {
    case 1:
    	m.eligible();
    	break;
    case 2:
    	m.checknum();
    	break;
    case 3:
    	m.oddEven();
    	break;
    case 4:
    	m.amstrongno();
    	break;
    case 5:
    	m.palindrome();
    	break;
    	default:
    		System.out.println("Please enter above choices");
    		break;  		
    }
    System.out.println("Enter you want to continue and press 'y'");
    ch=sc.next().charAt(0);

}while(ch=='y'||ch=='Y');
sc.close();

}
	
}

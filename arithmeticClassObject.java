import java.util.Scanner;

public class arithmeticClassObject {
	int n1,n2;
	public void accept()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers:");
		n1=sc.nextInt();
		n2=sc.nextInt();
	}
public void add()
{
	System.out.println("Add: "+(n1+n2));
	
}
public void sub()
{
	System.out.println("sub: "+(n1-n2));
	
}
public void mul()
{
	System.out.println("mul: "+(n1*n2));
	
}
static {
	System.out.println("arithmetic operators of all add,sub,mul");
}
public void div()
{
	System.out.println("div: "+(n1%n2));
	
}
	static {
		System.out.println("arithmetic operators");
	}

public static void main(String args[])
{
	arithmeticClassObject obj=new arithmeticClassObject();
obj.accept();

	obj.add();
	obj.sub();
	obj.mul();
	obj.div();
}

}
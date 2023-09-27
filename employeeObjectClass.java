import java.util.Scanner;

public class employeeObjectClass {
	long  empcode;
	double salary,allowance,gross,tax,net;
	String empname;
public void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter employee name:");
	empname=sc.next();
	System.out.println(empname+" employee code:");
	empcode=sc.nextLong();
	System.out.println(empname+" employee salary:");
	salary=sc.nextDouble();
}
public void allowance()
{
	allowance=salary*0.55d;
}
public void gross()
{
	 gross=salary+allowance;
}
public void tax()
{
	tax=gross*0.12d;
}
public void net()
{
	 net=gross-tax;
}
public void display()
{
	System.out.println("EMPLOYEE NAME: "+this.empname);
	System.out.println("EMPLOYEE CODE: "+this.empcode);
	System.out.println("EMPLOYEE salary: "+this.salary);
	System.out.println("EMPLOYEE allowance: "+allowance);
	System.out.println("EMPLOYEE gross: "+this.gross);
	System.out.println("EMPLOYEE tax: "+this.tax);
	System.out.println("EMPLOYEE net: "+this.net);



}

	public static void main(String[] args) {
		employeeObjectClass obj=new employeeObjectClass();
		System.out.println("*****************************");
		System.out.println("\t\tEMPLOYEE INFORMATION\t\t");
		System.out.println("*****************************");
		obj.accept();
obj.allowance();
obj.gross();
obj.tax();
obj.net();
obj.display();
	}

}

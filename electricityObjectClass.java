import java.util.Scanner;

public class electricityObjectClass {
	
String custname;
int numofcalls;
double phno,tax,bill;
public void accept()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter customer name:");
	custname=sc.next();
	System.out.println(custname+" phonenumber:");
	phno=sc.nextDouble();
	System.out.println(custname+" Number of phone calls:");
	numofcalls=sc.nextInt();
}	
void billing()
{
	if(numofcalls<=100)
		bill=numofcalls;
	else if(numofcalls>100&&numofcalls<=300)
		bill=numofcalls*0.80;
	else if(numofcalls>300&&numofcalls<=500)
		bill=numofcalls*1.25;
	else if(numofcalls>500)
		bill=numofcalls*2.50;
}
void calculate()
{
	tax=0.12*bill;
	double total=bill+tax;
	System.out.println(custname+" 's total bill amount is :"+total);

}
	public static void main(String[] args) {
		electricityObjectClass obj=new electricityObjectClass();
		obj.accept();
		obj.billing();
		obj.calculate();

	}

}

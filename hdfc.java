package abstraction;
import java.util.Scanner;

public class hdfc extends bank {
double principle=100000,yrs=5,rate=8.9,si;
	public double rateofinterest() {
		rate=8.9;
		System.out.println("Principal amount:100000");
		System.out.println("yrs:5");
	return rate ;
	}
	public void display()
	{
		 si =  (principle*rate*yrs)/100;
		System.out.println("Simple interest is: "+si+principle);

	}

	public static void main(String[] args) {
	System.out.println("BANK DETAILS");
	sbi obj=new sbi();
	obj.rateofinterest();
		hdfc obj1=new hdfc();
		System.out.println("hdfc BANK INTEREST: "+obj1.rateofinterest());
		obj1.display();
		obj1.print();
	}

}
/*package abstraction;

public class hdfc extends bank {

	@Override
	public double rateofinterest() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}*/

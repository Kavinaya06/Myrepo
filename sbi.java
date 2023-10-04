package abstraction;
import java.util.Scanner;

public class sbi extends bank {
double principle=10000,yrs=6,simpleinterest,rate;
	public double rateofinterest() {
		rate=7.4;
simpleinterest=(principle*yrs*rate)/100;
		System.out.println("simpleinterest: "+simpleinterest);
	return simpleinterest+principle ;
	}

	public static void main(String[] args) {
	System.out.println("BANK DETAILS");
		sbi obj=new sbi();
		System.out.println("SBI BANK INTEREST: "+obj.rateofinterest());
		obj.print();
	}

}
/*import java.util.Scanner;

public class sbi extends bank {

	static int principle;
	static int yrs;
	public double rateofinterest() {

	return 7.4 ;
	}

	public static void main(String[] args) {
	System.out.println("BANK DETAILS");
	Scanner sc=new Scanner(System.in);
	System.out.println("ENTER PRINCIPAL AMOUNT:");
	principle=(int) sc.nextDouble();
	System.out.println("ENTER years:");
	yrs=(int) sc.nextDouble();
	



		sbi obj=new sbi();
		System.out.println("SBI BANK INTEREST: "+obj.rateofinterest());
		obj.print();
	}

}*/
/*package abstraction;

public class triangle extends shapes {

	@Override
	public int sides() {
		// TODO Auto-generated method stub
		return 3;
	}
	public static void main(String args[]) {
		triangle obj=new triangle();
		System.out.println("sides of triangle: "+obj.sides());
		obj.print();
	}

}*/

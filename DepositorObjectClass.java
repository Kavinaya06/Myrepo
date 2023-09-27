import java.util.Scanner;

public class DepositorObjectClass {

	Scanner sc=new Scanner(System.in);

	public void accept()
	{
		System.out.println("bankers information");
		System.out.println("CUstomer name:");
		String name =sc.next();
	}
	public void amount()
	{
		double rate;
		System.out.println("CUstome's principal amount:");
		double principal=sc.nextDouble();
		System.out.println("CUstome's number of years:");
		int yrs=sc.nextInt();
		if(yrs<1)
		{
			rate=9;
			System.out.println("rate of interest: "+rate);
		}
		else if(yrs>=1&&yrs<=3)
		{
			rate=9.25;
			System.out.println("rate of interest: "+rate);

		}
		else if(yrs>=3&&yrs<=5)
		{
			rate=9.5;
			System.out.println("rate of interest: "+rate);
		}
		else 
		{
			rate=9.75;
			System.out.println("rate of interest: "+rate);
		}
		
		 double accuumatedamount=principal*Math.pow(1+(rate/100), yrs);
		
			System.out.println("accuumatedamount: "+accuumatedamount);

	}
	public static void main(String[] args) {
		DepositorObjectClass m=new DepositorObjectClass();
		m.accept();
		
		m.amount();
	}

}

package abstraction;
public abstract class sbi1 {
	public sbi1() {
	System.out.println("Sbi bank");
	}
public void calculate(double pr,double yrs)
{
	double rate=7.4;
	System.out.println("rate of interest=7.4");

	double si=pr*yrs*rate;
	si=si/100;
	System.out.println("sbi simple interest: "+si);
}
public void display()
{
	System.out.println("Sbi bank again welcomes you");

}
}

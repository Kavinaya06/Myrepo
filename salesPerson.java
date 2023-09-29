
public class salesPerson extends employee3 {
double sales,commission,totalsalary;

	public salesPerson()
	{
		super();
		sales=82;
	}

	public salesPerson(int id, String name, inheritanceRelationships address, double workingHour, double perDay,double sales) {
		super(id, name, address, workingHour, perDay);
this .sales=sales;
}
	public void calculate()
	{
		super.calculate();
		if(sales>=95)
commission=salary*0.2;
		else if(sales>=80)
			commission=salary*0.1;
		else if(sales>=75)
			commission=salary*0.05;
		else
			commission=0;
		
		totalsalary=salary+commission;	
	}
	public void display()
	{
		super.display();
		System.out.println("sales :"+sales);
		System.out.println("commission:"+commission);
		System.out.println("total salary :"+totalsalary);

	}
	
}

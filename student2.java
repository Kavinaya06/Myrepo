
public class student2 extends inheritancePerson {
 
 int total,percent,phy,chem,math;
public student2()
{
	super();
	phy=100;
	chem=100;
	math=100;
}
public student2(int id,String name,inheritanceRelationships address,int phy,int chem,int math)
{
	super(id,name,address);
	this.phy=phy;
	this.chem=chem;
	this.math=math;
}

public void calculate()
{
	total=phy+chem+math;
	percent=total/3;
	
}
public void display()
{
	 super.display();
	 System.out.println("Percent: "+percent);
}
}

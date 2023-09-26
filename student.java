
public class student {

	int rollno;
	String name,city;//instcance variable:declare inside a class;
	float phy,chem,math,total,percent;
	public student(){//default constructor
		rollno=101;
		name="kavi";
		city="pondy";//local variable:declaring inside a block or method;
		phy=99;
		chem=99;
		math=99;
	}
	public student(int id,String n,String c,float p,float ch,float m)//paramaterized constructor
	{
		rollno=id;
		name=n;
		city=c;
		phy=p;
		chem=ch;
		math=m;
	}
	//defining a method
	public void calculate()
	{
		total=phy+chem+math;
		percent=total/3;
	}
	//display student info
	public void display()
	{
		System.out.println("Student information:");
		System.out.println("Roll no:"+rollno);
		System.out.println("Student name:"+name);
		System.out.println("city:"+city);
		System.out.println("total:"+total);
		System.out.println("percent:"+percent);


	}
	
}

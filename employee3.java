
//public class employee3 {

//}

public class employee3 extends inheritancePerson {
 double workingHour,perDay,salary;
 public employee3()
 {
	 super();
	 workingHour=8;
	 perDay =2000;
 }
 public employee3(int id,String name,inheritanceRelationships address,double workingHour,double perDay)
 {
	 super(id,name,address);
	 this.workingHour=workingHour;
	 this.perDay=perDay;
	 
 }
 public void calculate()
 {
	 salary=workingHour*perDay;
 }
 public void display()
 {
	 super.display();
	 System.out.println("salary: "+salary);

 }
}

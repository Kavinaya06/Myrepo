
public class gradeStudent extends student2 {
char grade;
public gradeStudent()
{
	super();
	grade='A';	
}
public gradeStudent(int id, String name, inheritanceRelationships address, int phy, int chem, int math,char grade) {
	super(id, name, address, phy, chem, math);
	this.grade=grade;	
}
public void calculate()
{
	super.calculate();
	if(percent>=100)
		grade='A';
	else if(percent>=90)
		grade='B';
	else if(percent>=80)
		grade='c';
	else if(percent>=70)
		grade='d';
	else if(percent>=60)
		grade='e';
	else
		grade='f';
	
}
public void display()
{
	super.display();
	System.out.println("the required grade obtained by student is: "+grade);

	System.out.println("GRADE: "+grade);
}

}

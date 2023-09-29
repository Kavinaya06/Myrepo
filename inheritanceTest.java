
public class inheritanceTest {
public static void main(String args[])
{
	/*inheritancePerson obj=new inheritancePerson();
	obj.display();
	inheritancePerson obj2=new inheritancePerson(102,"amar",new inheritanceRelationships("502,Om tower","Bapat road","mumbai","mh","india","567567"));
	obj2.display();*/
	System.out.println(" EMPLOYEE");
	employee3 emp=new employee3();
	emp.calculate();
	emp.display();
	employee3 emp2=new employee3(102,"kavi",new inheritanceRelationships("502,Om tower","Bapat road","mumbai","mh","india","567567"),8,100000);
	emp2.calculate();
	emp2.display();
	System.out.println("--------------------------------------------------------------");
	System.out.println(" EMPLOYEE SALES");

	salesPerson obj=new salesPerson();
	obj.calculate();
	obj.display();
	salesPerson obj2=new salesPerson(102,"kavi",new inheritanceRelationships("502,Om tower","Bapat road","mumbai","mh","india","567567"),8,100000,83);
	obj2.calculate();
obj2.display();
System.out.println("--------------------------------------------------------------------");
System.out.println(" STUDENT");
student2 s=new student2();
s.calculate();
s.display();
student2 s2=new student2(100,"vijay",new inheritanceRelationships("502,Om tower","Bapat road","mumbai","mh","india","567567"),99,99,99);
s2.calculate();
s2.display();
System.out.println("--------------------------------------------------------------------");
System.out.println("GRADE STUDENT");
gradeStudent g=new gradeStudent();
g.calculate();
g.display();
gradeStudent g2=new gradeStudent(200,"suvi",new inheritanceRelationships("502,Om tower","Bapat road","mumbai","mh","india","567567"),80,80,80,'B');
g2.calculate();
g2.display();
}
}

import java.util.Scanner;

public class Test {
	public static void main(String args[])
	{
		/*student student=new student();
		student.calculate();
		student.display();
		
		student student2=new student(102,"pavi","pondicherry",50,100,100);
		student2.calculate();
		student2.display();*/
		
		/*defaultMethodEx obj=new defaultMethodEx();
		obj.accept();
		obj.add();
		int res=obj.sub();
		System.out.println("Sub:"+res);*/
		paramaterizedMethodEx obj=new paramaterizedMethodEx();
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		obj.circle(a);
		double res= obj.triangle(4,6);
		System.out.println("Area of a triangle:"+res);
obj.rectangle(7,5);

	}

}

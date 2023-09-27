public class studentObjectClass {
	String name,add;
	int age;
	long marks,mobno;
public void info()
{
	name="kavi";
	age=25;
	marks=99;
	mobno= 984309285;
	add="pondy";
}
public void display() {
	System.out.println("STUDENT INFO");
	System.out.println("NAME: "+name);
	System.out.println("age: "+age);
	System.out.println("marks: "+marks);
	System.out.println("mob: "+mobno);
	System.out.println("addresss: "+add);
}
public static void main(String args[])
{
	studentObjectClass m=new studentObjectClass();
	m.info();
	m.display();
}
}

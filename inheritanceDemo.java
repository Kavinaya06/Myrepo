import java.util.Scanner;

class employee {
	double salary;
	double bonus = 0.1 * salary;
}

class developer extends employee {
	public void dev()
	{
	double salary, total;
	System.out.println("DEveloper salary:");
	Scanner sc=new Scanner(System.in);
	salary=sc.nextDouble();
	total=bonus+salary;
	System.out.println("total: "+total);
	}
}

class tester extends employee {
	public void test()
	{
		double salary,total;
		System.out.println("tester salary:");
	Scanner sc=new Scanner(System.in);
	salary=sc.nextDouble();
	total=bonus+salary;
	System.out.println("total: "+total);
	}
}

public class inheritanceDemo {

	public static void main(String[] args) {
		double salary;
		System.out.println("Enter salary:");
        Scanner sc=new Scanner(System.in);
		salary=sc.nextDouble();
		developer m=new developer();
	tester n=new tester();
	if(salary>90000)
	m.dev();
	else
		n.test();
		

	}

}

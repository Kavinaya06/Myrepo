import java.util.Scanner;

public class ThreeSubjectMark {
	public static void main(String[] args)
	
	{
	double phy,chem,math,total,per;
		System.out.println("enter your three subject marks:");
		Scanner sc= new Scanner(System.in);
		phy=sc.nextDouble();
		chem=sc.nextDouble();
		math=sc.nextDouble();
		per=(phy+chem+math);
		total=per/3;
		if(phy<40||chem<40||math<40)
		{
			System.out.println("Fail");
	
		}
		else {
			if(per>=90)
				System.out.println("A+");
			else if(per>=75)
				System.out.println("A");
			else if(per>=60)
				System.out.println("B+");
			else if(per>=50)
				System.out.println("B");
			else 
				System.out.println("fail");
		}
	}

}
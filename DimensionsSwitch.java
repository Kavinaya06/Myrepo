import java.util.Scanner;

public class DimensionsSwitch {
	public static void main(String[] args)
	
	{
		char choice;
	
		float length,breadth,height,radius,areacircle,areatriangle,arearectangle;
		System.out.println("enter the value of length,breadth,height and radius:");
		Scanner sc= new Scanner(System.in);
		length=sc.nextFloat();
		breadth=sc.nextFloat();
		height=sc.nextFloat();
		radius=sc.nextFloat();
		System.out.println("enter your choice:\n + for circle \n - for triangle \n * for rectangle");
		choice=sc.next().charAt(0);
		switch(choice){
		case '+':
			areacircle=3.14f*(radius*radius);

			System.out.println("the area of a circle:"+areacircle);
			break;
		case'-':
			areatriangle=(height*breadth)/2;
			System.out.println("the area of a triangle:"+areatriangle);
			break;
		case'*':
			arearectangle=length*breadth;
			System.out.println("the area of a rectangle:"+arearectangle);
		break;
		default:
			System.out.println("invalid choice");
			
	}	
			
	}

}
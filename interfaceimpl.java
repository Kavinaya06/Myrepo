package abstraction;

public class interfaceimpl implements drawable,printable{
	
	public static void main(String args[]) {
		drawable obj=new interfaceimpl();//compile time=run time
		obj.calculate();
		obj.cube(4);
		System.out.println("square: "+drawable.square(2));
		obj.print();
	}

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		int radius=10;
		System.out.println("Area: "+(PI*radius*radius));
		
	}
	public void print()
	{
		System.out.println("achieved multiple inheritance");
	}
}
package exception;

public class MultiCatchJava7 {

	public static void main(String args[])
	{
		try {

			int a[]=new int[5];
			a[7]=12/0;
		}
		catch(ArithmeticException |ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("restof code");
	}
}

package exception;

public class finallyEx {

	public static void main(String args[])
	{
		System.out.println("case 1:here exception occurs and handled");
		try
		{
			String str=null;
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.err.println(e);
		}
		finally {
			System.out.println("finally blocl always executes");

		}
		System.out.println("case 1:rest of code");
		//system.exit(0);
		System.out.println("case 2:when exception  doesnot occurs ");
		try
		{
			int a=10/5;
			System.out.println("div: "+a);

		}
		catch(NullPointerException e)
		{
			System.err.println(e);
		}
		finally {
			System.out.println("case 2:finally blocl always executes");

		}
		System.out.println("case 2:rest of code");
		System.out.println("case 2:when exception  doesnot occurs ");
		try
		{
			String s = "abc";
			System.out.println(Integer.parseInt(s));

		}
		catch(NullPointerException e)
		{
			System.err.println(e);
		}
		finally {
			System.out.println("case 3:finally blocl always executes");

		}
		System.out.println("case 3:rest of code");

	}
}

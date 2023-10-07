package exception;

public class exceptionex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =10,b=0,c;
try {
c=a/b;
System.out.println("div:"+c);

}
//System.out.println(c);

catch(ArithmeticException e)
{
	System.out.println(e);
	e.printStackTrace();//useful by highlighting the line
System.err.println(e);
	
}
System.out.println("restof code");


	}

}

package exception;

public class NestedTry {
	public static void main(String args[]) {
		try {

			try {
				String str = null;
				System.out.println(str.length());

			} catch (NullPointerException e) {
				e.printStackTrace();
			}

			try {
				String s = "abc";
				System.out.println(Integer.parseInt(s));
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			System.out.println("Other statements");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("rest of code");

	}

}

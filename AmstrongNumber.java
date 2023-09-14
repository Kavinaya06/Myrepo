
import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String args[]) {
		int n, temp, temp1 = 0, save = 0, rem = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number:");
		n = sc.nextInt();
		temp = n;
		while (n > 0) {
			rem = n % 10;
			save = rem * rem * rem;
			temp1 = save + temp1;
			n = n / 10;
		}
		if (temp == temp1)
			System.out.println("amstrong number");

		else
			System.out.println("Not an amstrong number");

	}
}

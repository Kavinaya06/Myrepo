import java.util.Scanner;

public class stringLargestSmallest {
	public static void main(String args[]) {
		String str;
		String str2="";
		String str3="";
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter a string:");
		str = sc.nextLine();
		str=str.toLowerCase();
		System.out.println("the required string got from input is: " + str);
		String splstr[]=str.split(" ");
		int max=splstr[0].length();
		int min=splstr[0].length();

		for(int i=1;i<splstr.length;i++)
		{
			if(splstr[i].length()>max)
			{
				str2=splstr[i];
				//max=splstr[i].length();
				//System.out.println(splstr[i]);
				
			}
			if(splstr[i].length()<min)
			{
				str3=splstr[i];
				//max=splstr[i].length();
				//System.out.println(splstr[i]);
				
			}
			
		}
		System.out.println("largest: "+str2);
		System.out.println("smallest: "+str3);

			
	}

}

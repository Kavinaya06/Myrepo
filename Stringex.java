public class Stringex {
	public static void main(String args[])
	{
		String str="hello world";
		System.out.println(str);
		String str2= new String("welcome to edubridge");
		System.out.println(str2);
		String s1="welcome",s2="hello",s3="welcome",s4="    welcome to edubridg        ";
		System.out.println("charAt(3): "+s1.charAt(3));
		System.out.println("Length: "+s2.length());
		System.out.println("substring(3): "+s1.substring(3));
		System.out.println("substring(2,5): "+s1.substring(2,5));
		System.out.println("contains('e'): "+s1.contains("e"));
		System.out.println("contains('x'): "+s1.contains("x"));
       System.out.println("s1.equals(s3): "+s1.equals(s3));
		System.out.println("s1.equalsIgnoreCase(s3): "+s1.equalsIgnoreCase(s3));
		System.out.println("isEmpty() : "+s1.isEmpty());
		System.out.println("indexOf('e') : "+s1.indexOf('e'));
		System.out.println("lastIndexOf('e') : "+s1.lastIndexOf('e'));
		System.out.println("concat() : "+s2.concat("user"));
		System.out.println(s2);
s2=s2.concat("user");
System.out.println("replace('e','a') : "+s3.replace('e', 'a'));
System.out.println("Uppercase : "+s1.toUpperCase());
System.out.println("lowercase : "+s1.toLowerCase());
System.out.println("Length before trim(): "+s4.length());
s4=s4.trim();
System.out.println("Length after trim(): "+s4.length());
String splitedStrings[]=str2.split(" ");
for(String string: splitedStrings){
	//splitedstrings[0]="welcome"
	//splitedstrings[1]="to"
	System.out.println(string);//splitedstrings[0]="edubridge"

}
		
System.out.println("count of words: "+splitedStrings.length);


		
	}

}

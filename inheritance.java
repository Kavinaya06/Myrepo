class parentclass
{
	public void play()
	{
		System.out.println("child wants to play");

	}
}
public class inheritance extends parentclass {
	public void football()
	{
		System.out.println("child wants to play football");
	}
public static void main(String args[])
{ inheritance sc=new inheritance();
sc.play();
sc.football();
		
}
}

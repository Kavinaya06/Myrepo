
public class inheritancePerson {
	int id;
	String name;
	inheritanceRelationships address;
	public inheritancePerson()
	{
		id=101;
		name="kavi";
		address=new inheritanceRelationships();	
	}
	public inheritancePerson(int id,String name,inheritanceRelationships address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		
	}
	public void display() {
System.out.println("id:"+id);
System.out.println("Name:"+name);
address.display();


	}
}

package abstraction;

public class encapsulation {
private int id;
private String name,phonenumber;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}

	public static void main(String[] args) {
encapsulation obj= new encapsulation();
obj.setId(301);
obj.setName("kavi");
obj.setPhonenumber("3015251451111");
System.out.println("id: "+obj.getId());
System.out.println("Name: "+obj.getName());
		
System.out.println("Phonenumber: "+obj.getPhonenumber());

	}
	
}

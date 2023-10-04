package abstraction;

public class objectMethods implements Cloneable {
int id;
String name;
float percentage;
public objectMethods(int id, String name, float percentage) {
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
}

@Override
public String toString() {
	return "objectMethods [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
}

/*public String toString() {
	return "objectMethods [id=" + id + ", name=" + name + ", percentage=" + percentage + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}*/


	@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		objectMethods obj=new objectMethods(101,"kavi", .0987f);
		System.out.println(obj.toString());//objtoString();
objectMethods obj2=(objectMethods)obj.clone();
System.out.println(obj2);

	}

	}




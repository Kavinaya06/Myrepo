
public class inheritanceRelationships {
	String addressline,street,city,state,country,pincode;
	
	public inheritanceRelationships() {
		
	addressline="no11,angalamman";
	street="thavalkuppam";
	city="puducherry";
	country="india";
	pincode="605007";
	}

	public inheritanceRelationships(String addressline, String street, String city, String state, String country,
			String pincode) {
		super();
		this.addressline = addressline;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	public void display()
	{
	System.out.println("Address:"+addressline+","+street+","+city+","+state+","+country+","+pincode);
	
	}
	

}

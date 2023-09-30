
public class myDate {
	String addressline,street,city,state,country,pincode;

	int id;
	String name,address,dateofbirth;
	public myDate() {
		addressline="no11,angalamman";
		street="thavalkuppam";
		city="puducherry";
		state="puducherry";

		country="india";
		pincode="605007";
	}
	
	public myDate(String addressline, String street, String city, String state, String country, String pincode 
			) {
		this.addressline = addressline;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
		;
	}

	public void display()
	{
		System.out.println("Address:"+addressline+","+street+","+city+","+state+","+country+","+pincode);
	}
	

}

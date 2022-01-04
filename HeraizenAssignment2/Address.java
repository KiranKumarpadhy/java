
public class Address {

	String city,state;
	int doorNo;

	public Address(int doorNo, String city, String state) {
		super();
		this.doorNo = doorNo;
		this.city = city;
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", city=" + city + ", state=" + state + "]";
	}
	
}

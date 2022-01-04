package HeraizenAssignmentNo6;

public class dataofmember implements Comparable <dataofmember> {
	String mid, name, city, country;

	public dataofmember(String mid, String name, String city, String country) {
		super();
		this.mid = mid;
		this.name = name;
		this.city = city;
		this.country = country;
	}

	public void display(){
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Member [mid=" + mid + ", name=" + name + ", city=" + city + ", country=" + country + "]";
	}

	@Override
	public int compareTo(dataofmember o) {
	 return this.name.compareTo(o.name);
	}
}

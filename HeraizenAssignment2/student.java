
public class student {
	int id;
	String name;
	Address address;
	static int count;
	
	public student(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
		count++;
	}
	
	public void display()
	{
		System.out.println("Name "+this.name);
		System.out.println("ID "+this.id);
		System.out.println("Address "+this.address.toString());
		
	}
	public static int total()
	{
		return count;
	}

	public static void main(String[] args) {
		
		Address a1=new Address(1, "ambapua", "Berhumpur");
		student s1=new student(17010111,"kiran",a1);
		s1.display();
		
		Address a2=new Address(2, "gandhi najar", "Berhumpur");
		student s2=new student(17010112,"kumar",a2);
		s2.display();
		
		Address a3=new Address(3, "vivek vihar", "Berhumpur");
	    student s3=new student(17010113,"hello",a3);
		s3.display();
		
		System.out.println("count of object  "+total());
//		Student s=new Student();
		
		
}
}


public class Employee_que_7 {
	String id,name;
	double salary;
	
public Employee_que_7(String id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


public Employee_que_7(String id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.salary = 20000;
	}

public void display() {
	System.out.println("Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]");
}

public static void main(String[] args) {
	Employee_que_7 e1 = new Employee_que_7("101", "kiran_kumar");
	e1.display();
	
	Employee_que_7 e2 = new Employee_que_7("102", "kiran", 100000);
	e2.display();
	}
}


public class Employee {
	
	int id,salary;
	String name;
	
	
	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Product [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
  public void display()
  {
	  System.out.println(" id ="+id+" name ="+name+" salary ="+salary);
  }

	public static void main(String[] args)
	{
		Employee p=new Employee(100,25000,"miani");
		p.display();
		
	}

}

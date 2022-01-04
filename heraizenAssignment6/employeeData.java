package HeraizenAssignmentNo6;

public class employeeData {
	int empno;
	String ename;
	String job;
	public employeeData(int no,String name,String job) {
	this.empno=no;
	this.ename=name;
	this.job=job;
	}
	public void showInfo(){
		System.out.println("Employee");
		System.out.println("Id : "+this.empno);
		System.out.println("Id : "+this.ename);
		System.out.println("Id : "+this.job);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employeeData other = (employeeData) obj;
		if (empno != other.empno)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", job=" + job + "]";
	}
	
}

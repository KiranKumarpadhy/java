package HeraizenAssignmentNo6;

public class testofemployeedata {
	public static void main(String[] args) {
		employeeData s1 = new employeeData(1, "Ramu", "Developer");
		employeeData s2 = new employeeData(2, "Bheemu", "Developer");
		employeeData s3 = new employeeData(3, "Gomu", "Developer");
		employeeData s4 = new employeeData(1, "Somu", "Developer");
		employee_package_data e = new employee_package_data();
		e.addEmployee(s1);
		e.addEmployee(s2);
		e.addEmployee(s3);
		e.addEmployee(s4);
		e.viewEmployees();
		e.deleteEmployee(1);
		e.viewEmployees();
		e.viewEmployee(2);
		
	}
}

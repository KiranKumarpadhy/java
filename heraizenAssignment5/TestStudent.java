package HeraizenAssignmentNo5;

public class TestStudent {
	public static void main(String[] args) {
		showdataofstudent obj = new showdataofstudent();
		student s1 = new student("Ramu", "ramu@gmail.com", "Mathematics");
		student s2 = new student("Bheemu", "bheemu@gmail.com", "Mathematics");
		student s3 = new student("Somu", "somu@gmail.com", "Mathematics");
		student s4 = new student("Lakshman", "lakshman@gmail.com", "Mathematics");
		student s5 = new student("Dhanya", "dhanya@gmail.com", "Mathematics");
		obj.addStudentdata(s1);
		obj.addStudentdata(s2);
		obj.addStudentdata(s3);
		obj.addStudentdata(s4);
		obj.addStudentdata(s5);
		obj.viewStudents();
		obj.viewStudent(10001);
		
	}
}

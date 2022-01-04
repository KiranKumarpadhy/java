package HeraizenAssignmentNo5;
import java.util.HashMap;
import java.util.*;
import java.util.Map;
public class showdataofstudent {
	Map<Integer,student> students = new HashMap<Integer,student>();
	public void addStudentdata(student s){
		int num = student.getId();
		students.put(num, s);
	}
	
	
	@Override
	public String toString() {
		return "showdataofstudent [students=" + students + "]";
	}


	public void viewStudents(){
		System.out.println("Students List...");
		Set<Integer> key = students.keySet();
		for(Integer i : key){
			System.out.println(students.get(i));
		}
	}
	public void viewStudent(Integer id){
		System.out.println("Student id "+id+" Details");
		System.out.println(students.get(id));
	}
}

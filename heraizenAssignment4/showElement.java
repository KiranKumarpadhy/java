package HeraizenAssignmentNo4;
import java.util.*;
public class showElement {
public void viewElements(Map<Integer, String> map){
		
		System.out.println(map.entrySet());
		}
	
	public static void main(String[] args) {
		showElement s = new showElement();
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(10001, "ramesh");
		m.put(1002, "Kiran");
		s.viewElements(m);
	}
}


package HeraizenAssignmentNo4;
import java.util.*;
public class delectName {
	public Set<String> checkName(Set<String> set, String name){
		boolean flag=false;
		for(String s :set){
			if(s.equals(name)){
				flag=true;
				
			}
		}
		if(!flag){
			System.out.println(name+" not found i set");
		}else{
			set.remove(name);
		}
		return set;
		}
	
	public static void main(String[] args) {
		delectName r = new delectName();
		Set<String> s = new HashSet<String>();
		s.add("kiran");
		s.add("ravi");
		s.add("Suresh");
		s.add("Ramesh");
		s.add("rahul");
		s.add("mahesh");
		System.out.println(s);
		
		System.out.println(r.checkName(s, "Ramesh"));
		

}
}

package HeraizenAssignmentNo4;
import java.util.*;
import java.util.List;

public class showList {
	public void showElements(List<String> list){
		if(list.isEmpty()){
			System.out.println("List is Empty");
		}else{
			for(String s : list){
				System.out.println(s);
			}
			//System.out.println(list);
		}
		 }
	
	public static void main(String[] args) {
		List<String> list= new ArrayList<String>();
		list.add("ABC");
		list.add("BCD");
		list.add("CDE");
		list.add("DEF");
		showList s = new showList();
	s.showElements(list);
	}
}

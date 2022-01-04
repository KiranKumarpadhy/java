package HeraizenAssignmentNo4;
import java.util.*;
public class convertarraytolist {
	public String[] getResults(String names[]){
		ArrayList<String> list = new ArrayList<String>();
		for(String s : names){
	
			list.add(s);
		}
		Collections.sort(list);
		Collections.reverse(list);
		 String[] str = new String[list.size()];
		 
	        for (int i = 0; i < list.size(); i++) {
	            str[i] = list.get(i);
	        }
	        return str;
		}
	
	public static void main(String[] args) {
		String[] s = {"rahul","ayush","suresh,","dev"};
		convertarraytolist c = new convertarraytolist();
		System.out.println("befor sort");
		for(String str : s){
			System.out.println(str);
		}
		System.out.println("After sort");
		String[] s2=c.getResults(s);
		for(String str : s2){
			System.out.println(str);
		}
	}

}

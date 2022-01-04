package HeraizenAssignmentNo5;
import java.util.*;
public class statecapitaldata {
	private Map<String,String> state_capital=new HashMap<String,String>();
	
	public void add_state_capital(String state,String capital){
			state_capital.put(state, capital);
			}
	public void viewCapital(String name){
			if(state_capital.containsKey(name)){
				System.out.println(state_capital.get(name));
			}else{
				System.out.println("The State "+name+" is not found in the list");
			}
			}
}

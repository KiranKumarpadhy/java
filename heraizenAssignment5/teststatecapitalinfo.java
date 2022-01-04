package HeraizenAssignmentNo5;

public class teststatecapitalinfo {
	public static void main(String[] args) {
		statecapitaldata obj = new statecapitaldata();
		obj.add_state_capital("delhi", "‎New Delhi");
		obj.add_state_capital("odisha", "bhubanaswar");
		obj.add_state_capital("AndraPradesh", "Amaravati");
		obj.add_state_capital("Maharashtra", "Mumbai");
		obj.viewCapital("delhi");
		obj.viewCapital("odisha");
		obj.viewCapital("AndraPradesh");
	}
}

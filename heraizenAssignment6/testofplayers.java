package HeraizenAssignmentNo6;
import java.util.*;
public class testofplayers {
	public List<String> getPlayers(List<dataofplayers> football, List<dataofplayers> cricket){
		List<String> list = new ArrayList<String>();
		football.retainAll(cricket);
		for(dataofplayers p : football){
			list.add(p.name);
		}
		return list;
	}

public static void main(String[] args) {
	dataofplayers p1 = new dataofplayers("sachin", "sachin@hotmail.com", "mumbai", "maharastra", 52);
	dataofplayers p2 = new dataofplayers("ganguli", "ganguli@gmail.com", "westbengal", "sonagachi", 46);
	dataofplayers p3 = new dataofplayers("virat", "virat@gmail.com", "Bengaluru", "Karnataka", 44);
	dataofplayers p4 = new dataofplayers("dhoni", "dhoni@hotmail.com", "chenni", "maharulu", 51);
	dataofplayers p5 = new dataofplayers("kiran", "kiran@gmail.com", "odisha", "bhubaneswar", 27);
	List<dataofplayers> cricket = new ArrayList<dataofplayers>();
	cricket.add(p1);
	cricket.add(p2);
	cricket.add(p3);
	cricket.add(p4);
	List<dataofplayers> football = new ArrayList<dataofplayers>();
	football.add(p1);
	football.add(p2);
	football.add(p3);
	football.add(p5);
	testofplayers tp = new testofplayers();
	List<String> l = tp.getPlayers(football, cricket);
	System.out.println(l);
}
}

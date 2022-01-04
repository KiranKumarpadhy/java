package HeraizenAssignmentNo6;
import java.util.Scanner;
public class member_client_data {
	static Scanner sc1=new Scanner(System.in);
	static Scanner sc2=new Scanner(System.in);
	static memberpackagedata m = new memberpackagedata();
	public static void main(String[] args) {
		int val=0;
		while(val==0){
			
		System.out.println("Enter 1 for Addmember ");
		System.out.println("Enter 2 for deleteMember ");
		System.out.println("Enter 3 for SearchById");
		System.out.println("Enter 4 for searchByNameAndId");
		System.out.println("Enter 5 for displaySortingOrder");
		System.out.println("Enter 6 for exit");
		int i = sc1.nextInt();
		
		switch(i){
		case 1: {
			add();
			break;
		}
		case 2:{
			delete();
			break;
		}
		case 3: {
			searchById();
			break;
		}
		case 4:{
			searchByNameAndId();
			break;
		}
		case 5:{
			displaySortingOrder();
			break;
		}
		case 6:{
			val=1;
			break;
		}
		default:System.out.println("invalid input");
		}
		}
	}

	private static void displaySortingOrder() {
		// TODO Auto-generated method stub
		System.out.println("Enter Asce for ascending sort or Desc for descending sort");
		String order = sc2.nextLine();
		m.displaySortingOrder(order);
	}

	private static void searchByNameAndId() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID");
		String id = sc2.nextLine();
		System.out.println("Enter Name");
		String name = sc2.nextLine();
		m.searchMember(id, name);
	}

	private static void searchById() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID");
		String id = sc2.nextLine();
		m.searchById(id);
	}

	private static void delete() {
		// TODO Auto-generated method stub
		System.out.println("Enter ID");
		String id = sc2.nextLine();
		m.deleteMember(id);
	}

	private static void add() {
		// TODO Auto-generated method stub
		System.out.println("Enter Name");
		String name = sc2.nextLine();
		System.out.println("Enter City");
		String city = sc2.nextLine();
		System.out.println("Enter Country");
		String country = sc2.nextLine();
		m.addMemeber(name, city, country);
	}
}

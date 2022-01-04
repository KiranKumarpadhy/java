package HeraizenAssignmentNo6;
import java.util.Scanner;
public class contactbookclientdata {
	public static void main(String[] args) {
		Scanner sc1=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		int check=1;
		while(check==1){
			System.out.println("");
		System.out.println("Enter 1 for Add new phone book entry");
		System.out.println("Enter 2 for Search name");
		System.out.println("Enter 3 for Quit");
		int val = sc1.nextInt();
			switch(val){
			case 1:{
				System.out.println("Enter phone number");
				String num = sc2.nextLine();
				System.out.println("Enter name");
				String name=sc2.nextLine();
				add(num,name);
				break;
			}
			case 2:{
				System.out.println("Enter phone Number");
				String num = sc2.nextLine();
				search(num);
				break;
			}
			case 3:{
				check=0;
				break;
			}
			default:{
				System.out.println("Enter valid choice");
			}
				
			}
			
		}
	}
	private static void search(String num) {
		System.out.println(dataofcontact.getName(num));
		
	}
	public static void add(String num , String name){
		dataofcontact.addDetails(num, name);
	}
}

package HeraizenAssignmentNo6;
import java.util.*;
public class memberpackagedata {
	 List<dataofmember> dataofmember = new ArrayList<dataofmember>();
	  
	  public void addMemeber (String name,String city,String country){
		  String id = id_member.getMemeberId();
		  dataofmember m = new dataofmember(id, name, city, country);
		  dataofmember.add(m);
	  }
	  
	  public void deleteMember(String id){
		  boolean flag=false;
		  for(dataofmember m : dataofmember){
			  if(m.mid.equals(id)){
				  flag=true;
				  dataofmember.remove(m);
			  }
		  }
		  if(!flag){
			  System.out.println("Member not found with Id "+id);
		  }
	  }
	  
	  public void searchById(String id){
		  if(dataofmember.size()==0){
			  System.out.println("List is Empty");
			  return;
		  }
		  boolean flag=false;
		  for(dataofmember m : dataofmember){
			  if(m.mid.equals(id)){
				  flag=true;
				  System.out.println(m.toString());
			  }
		  }
		  if(!flag){
			  System.out.println("Sorry! no member found");
		  }
	  }
	  public void searchMember(String id,String name){
		  if(dataofmember.size()==0){
			  System.out.println("List is Empty");
			  return;
		  }
		  boolean flag=false;
		  for(dataofmember m : dataofmember){
			  if(m.mid.equals(id) || m.name.equals(name)){
				  flag=true;
				  System.out.println(m.toString());
			  }
		  }
		  if(!flag){
			  System.out.println("Sorry! no member found");
		  }
	  }
	  
	  public void displaySortingOrder(String s) {
		  Collections.sort(dataofmember);
		  if(s.equals("Desc")){
			  Collections.reverse(dataofmember);
		  }
		  
		  System.out.println(dataofmember);
	  }
}

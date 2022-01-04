package HeraizenAssignmentNo5;
import java.util.*;
public class primeData {
	public void generatePrimes(int no){
		List<Integer> list = new ArrayList<Integer>();
		int num=0;
		for(int i=0;true;i++){
			boolean flag=true;
			if(i==0 || i==1){
				continue;
			}
			 for(int j=2; j<=i/2; j++){
		            // if the number is divisible by i, then n is not a prime number.
		            if(i%j==0){
		            	flag=false;
		            	break;
		            }
		        }
			 if(flag){
				 list.add(i);
				 num++;
			 }
			 if(num==no){
				 break;
			 }
			 
			
		}
		 showPrimes( list );
		}
	
	public void showPrimes(List list){
		System.out.println(list);
		}
	
	public static void main(String[] args) {
		primeData p = new primeData();
		p.generatePrimes(10);
		
	}
}

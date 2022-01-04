package practice;
import java.util.Scanner;
public class consonants {
	static int count = 0;
	static int number=0;

public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	System.out.print("Enter String - ");  
	String a= sc.nextLine();  
	for (int i=0 ; i<a.length(); i++){
        char ch = a.charAt(i);
//        System.out.println(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
        	count++;
         }else if(ch != ' '){
            number++;
         }
     }
     System.out.println("Number of vowels in the given sentence is "+count);
     System.out.println("Number of consonants in the given sentence is "+number);
  }
}


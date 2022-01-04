package practice;

import java.util.Scanner;

public class practiceOne {
	static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;       
        while (i < j) {          
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
	System.out.print("Enter String - ");  
	String a= sc.nextLine();  
	int length = a.length();
	System.out.println("length of string -"+length);  
	System.out.println("uppercase -"+a.toUpperCase());
	System.out.println("Lowercase -"+a.toLowerCase());       
        String str = a;      
        if (isPalindrome(str))
            System.out.print("Yes it is palindrome");
        else
            System.out.print("No it is palindrome");	
}
}

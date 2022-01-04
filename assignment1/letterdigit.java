package practice;
import java.util.*;
public class letterdigit {
		public static void main(String[] args) {
	  
		Scanner sc=new Scanner(System.in);
		
		String str;
		System.out.println("Enter the string: ");
		str=sc.nextLine();
		 
		count(str);
		}
		static void count(String s)
		{
		    char[] ch=s.toCharArray();
		    int letter=0,digit=0,space=0;
		    for (int i=0;i<s.length() ;i++ )
		    {
		        if(Character.isLetter(ch[i]))
		        {
		            letter++;
		        }
		        else if(Character.isDigit(ch[i])){
					digit ++ ;
				}
				else if(Character.isSpaceChar(ch[i])){
					space ++ ;
				}
		    }
		   
		    System.out.println("letter: " + letter);
		    System.out.println("digit: " + digit);
		    System.out.println("space: " + space);
		}
		
	}

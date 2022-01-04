import java.util.Scanner;
public class question_3 {

	public static void main(String[] args) {
			
			System.out.println("Enter your Choice");
			System.out.println("1. Factorial\n" + 
					"2. Table\n" + 
				"3. Prime or not");
			
			Scanner sc=new Scanner(System.in);
			
			int opt=sc.nextInt();
			switch(opt)
			{
			case 1:
			{
				System.out.println("Enter the Number");
				int no=sc.nextInt();
				int fact=1;
				for(int i=1;i<=no;i++)
			   {
				   fact=fact*i;    
			   }
			   System.out.println("Factorial ="+fact);
			   break;
			}
			case 2:
			{
				System.out.println("Enter the Number");
				int no=sc.nextInt();
				
				
				for(int i=1;i<=10;i++)
				   {
					   System.out.println(no +" * "+i+" = "+(no*i));
				   }
				break;
				
				
			}
			case 3:
			{
				System.out.println("Enter the Number");
				int num=sc.nextInt();
				
				boolean flag = false;
			    for (int i = 2; i <= num / 2; ++i) {
			      
			      if (num % i == 0) {
			        flag = true;
			        break;
			      }
			    }

			    if (!flag)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
			    break;
			
			}
			
			}
			
		}
	}

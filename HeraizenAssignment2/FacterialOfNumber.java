
public class FacterialOfNumber {
	public static int FacterialOfNumber(int no)
	{
		if(no==0)
		{
			return 1;
		}
		else
		{
			return no*FacterialOfNumber(no-1);
		}
	}
	public static void main(String[] args)
	{
		int fact=1;
		int number=4;
		
		fact=FacterialOfNumber(number);
		System.out.println("facterial :"+fact);
	}
}

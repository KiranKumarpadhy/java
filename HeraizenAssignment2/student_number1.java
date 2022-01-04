import java.util.Arrays;
public class student_number1 {
	int id;
	String name;
	String[] subj;
	
	
	public student_number1(int id, String name, String[] subj) {
		super();
		this.id = id;
		this.name = name;
		this.subj = subj;
	}
	
	
	public void display() {
		System.out.println("Student1 [id=" + id + ", name=" + name + ", subj=" + Arrays.toString(subj) + "]");
	}

	public static int  calSum(int a[])
	{
		int sum=0;
		for (int i:a)
		{
			sum+=i;
		}
		return sum;
	}


	public static void main(String[] args)
	{
		
		String[] sub1= {"ODIA","ENGLISH","SCIENCE","HISTORY","PHYSICS","CHEMISTRY"};
		student_number1 s1=new student_number1(101, "KIRAN", sub1);
		s1.display();
		int [] a= {0,1,2,3,4,5,};
		System.out.println("sum =>"+student_number1.calSum(a));
		
	}
	
}


//question_5
public class Product {

	String pid, pname;
	int price;

	public Product(String pid, String pname, int price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}
	
	private void diplay() {
		System.out.print("Product Id = "+pid + "  " + " Product Name = "+pname + "    Price "+ price);  
		System.out.println();  
	}
	
	public static void main(String[] args) {
		Product[] obj = new Product[10];
		obj[0] = new Product("1","OnePlus 4 ", 35000);  
		obj[1] = new Product("2","OnePlus 5 ", 30225);  
		obj[2] = new Product("3","OnePlus 6",20000);  
		obj[3] = new Product("4","OnePlus 7",25000);  
		obj[4] = new Product("5","OnePlus 8", 100000);  
		obj[5] = new Product("6", "OnePlus 9", 40000);
		obj[6] = new Product("7","LG",70000);  
		obj[7] = new Product("8","Dell",40000);  
		obj[8] = new Product("9","Mi ", 9000);
		obj[9] = new Product("0","Lenovo", 30000);
		
		for(int i = 0; i<obj.length; i++) {
			obj[i].diplay();
		}
	}

}

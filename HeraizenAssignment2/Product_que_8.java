
public class Product_que_8 {
	String id;
	String name;
	float price;
	
	public Product_que_8(String id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void swap(Product_que_8 desktop) {
		float pri = desktop.price;
		desktop.price = this.price;
		this.price = pri;
	}

	public static void main(String[] args) {
		Product_que_8 laptop = new Product_que_8("1", "DELL", 10000);
		Product_que_8 desktop = new Product_que_8("2", "lg", 20000);
		System.out.println("laptop  "+laptop.price);
		System.out.println("desktop  "+desktop.price);
		
		laptop.swap(desktop);
		
		System.out.println("laptop  "+laptop.price);
		System.out.println("desktop  "+desktop.price);
	}
	
	
}


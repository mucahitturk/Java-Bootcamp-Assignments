package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product product = new Product(1,"Asus Laptop","4GB Ram",10000,10,"Black");
		ProductManager productManager = new ProductManager(); 
		productManager.Add(product);
	}

}

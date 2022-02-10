package consdemo;

public class Product {

		int productId; 
		String productName; 
		int quantityOnHand; 
		int price; 
		int star;
		//constructor - used to initialize 
		public Product() {
			
			productId=1;
			productName="bread";
			quantityOnHand = -1; 
			price = -1;
			star = -1;
			System.out.println("PRODUCT CONSTRUCTOR CALLED");
			
		}
		
		public Product(int productId, String productName, int quantityOnHand, int price, int star) {
			this(); 
			this.productId = productId;
			this.productName = productName;
			this.quantityOnHand = quantityOnHand;
			this.price = price;
			this.star = star;
		}
		public Product( int productId, String productName, int price) {
			this(); 
			this.productId = productId;
			this.productName = productName; 
			this.price = price; 
		}

		public void printProductDetails() {
			System.out.println("Product ID : " + productId);
			System.out.println("product Name : " + productName);
			System.out.println("Quantity On Hand : " + quantityOnHand);
			System.out.println("Price : " + price);
		}
		
		
		public static void main (String[] args) {
			Product product1 = new Product(); 
			System.out.println("Printing the details about product1"); 
			product1.printProductDetails();
			
			System.out.println("Printing the details about product2"); 
			Product product2 = new Product(); 
			product2.printProductDetails(); 
			new Product().printProductDetails();
			
		}
}

package entities;

public class OrderItem {

	private int quantity;
	private double price;
	
	private Product product;
	
	public OrderItem() {
		
	}
	
	public OrderItem(int quantity, double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public double subTotal() {
		return quantity*price;
	}
	
	
	public Product getProduct() {
		return product;
	}

	
	
	public void addProduct(Product product) {
		this.product = product;
	}
	
	
}

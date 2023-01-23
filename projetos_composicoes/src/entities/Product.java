package entities;

public class Product {
	
	private String product;
	private double price;
	
	public Product() {}

	public Product(String product, double price) {

		this.product = product;
		this.price = price;
	}

	public String getNameProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}

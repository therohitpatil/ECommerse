package online_portal;

public class Product {
	private int productId, quantity, availablityArea;
	private double productCost;
	private String productName;
	
	
	public Product(int productId, int quantity, int availablityArea, double productCost, String productName) {

		
		this.productId = productId;
		this.quantity = quantity;
		this.availablityArea = availablityArea;
		this.productCost = productCost;
		this.productName = productName;
	}
	
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getAvailablityArea() {
		return availablityArea;
	}
	public void setAvailablityArea(int availablityArea) {
		this.availablityArea = availablityArea;
	}
	public double getProductCost() {
		return productCost;
	}
	public void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	
}

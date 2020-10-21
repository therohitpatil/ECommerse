package online_portal;

public class ShoppingCart {
	private double totalBill;
	private int numberOfItems;
	private Product prod;
	
	
	
	public ShoppingCart(double totalBill, int numberOfItems, Product prod) {
		super();
		this.totalBill = totalBill;
		this.numberOfItems = numberOfItems;
		this.prod = prod;
	}
	
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double totalBill) {
		this.totalBill = totalBill;
	}
	public int getNumberOfItems() {
		return numberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	
	
	
}

package online_portal;

public class Customer {
	private int customerId;
	private String customerName, password, address;
	private double walletBalance;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public Customer(int customerId, String customerName, String password, String address, double walletBalance) {
		
		this.customerId = customerId;
		this.customerName = customerName;
		this.password = password;
		this.address = address;
		this.walletBalance = walletBalance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public double getWalletBalance() {
		return walletBalance;
	}
	public void setWalletBalance(double walletBalance) {
		this.walletBalance = walletBalance;
	}
}

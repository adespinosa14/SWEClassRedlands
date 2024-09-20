public class Item {
	private String item;
	private double cost;
	private int quantity;
	
	public Item(String item, double cost, int quantity) {
		this.item = item;
		this.cost = cost;
		this.quantity = quantity;
	}
	
	// Get Item
	public String getItem() {
		return item;
	}
	
	// Get Cost
	public double getCost() {
		return cost;
	}
	
	// Get Quantity
	public int getQuantity() {
		return quantity;
	}
	
	// Set Item
	public void setItem(String item) {
		this.item = item;
	}
	
	// Set Cost
	public void setCost(double cost) {
		this.cost = cost;
	}
	
	// Set Quantity
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	// Add the items
	
}

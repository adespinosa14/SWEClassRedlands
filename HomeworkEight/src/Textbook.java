package HomeworkEight.src;

public class Textbook 
{
	private String SKU;
	private String title;
	private int price;
	private int quantity;
	
	public Textbook(String SKU, String title, int price, int quantity) 
	{
		this.SKU = SKU;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}
	
// Setters and Getters
	
	// Setters
	public void SetSKU(String SKU) 
	{
		this.SKU = SKU;
	}
	
	public void SetTitle(String title) 
	{
		this.title = title;
	}
	
	public void SetPrice(int price) 
	{
		this.price = price;
	}
	
	public void SetQuantity(int quantity) 
	{
	}
	
	// Getters
	public String GetSKU()
	{
		return SKU;
	}
	
	public String GetTitle() 
	{
		return title;
	}
	
	public int GetPrice() 
	{
		return price;
	}
	
	public int GetQuantity() 
	{
		return quantity;
	}
	
}

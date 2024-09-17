package HomeworkThree;

public class SalesListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item = new Item("Dog Food", 10.99, 1);
		System.out.println("Item: " + item.getItem() +  " | Cost: " + item.getCost() + " | Quantity: " + item.getQuantity());
	}

}

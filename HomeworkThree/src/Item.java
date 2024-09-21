package HomeworkThree.src;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/** Item Builder
 * 
 * @author Andrew Espinosa
 * @version 1.0
 * 
 */

public class Item {
	private String item;
	private String cost;
	private String quantity;
	
	/** Initialize Item
	 * 
	 * @param item
	 * @param cost
	 * @param quantity
	 * 
	 */
	
	public Item(String item, String cost, String quantity) {
		this.item = item;
		this.cost = cost;
		this.quantity = quantity;
	}
	
	/** Get Item Name
	 * 
	 * @return String
	 * 
	 */
	public String getItem() {
		return item;
	}
	
	
	/** Get Item Cost
	 * 
	 * @return String
	 * 
	 */
	public String getCost() {
		return cost;
	}
	
	/** Get Item Quantity
	 * 
	 * @return String
	 * 
	 */
	public String getQuantity() {
		return quantity;
	}
	
	/** Set Item Name
	 * 
	 * @param String item
	 * 
	 */
	public void setItem(String item) {
		this.item = item;
	}
	
	/** Set Item Cost
	 * 
	 * @param String cost
	 * 
	 */
	public void setCost(String cost) {
		this.cost = cost;
	}
	
	/** Set Item Quantity
	 * 
	 * @param String quantity
	 * 
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	/** Check if any box is empty OR are wrong type
	 * 
	 * @param String item
	 * @param String cost
	 * @param String quantity
	 * @param String area
	 * @return boolean
	 * 
	 */
	public boolean checkError(String item, String cost, String quantity, JTextArea area) {
		if(item.isEmpty() || cost.isEmpty() || quantity.isEmpty() ) {
			JOptionPane.showMessageDialog(null, "Please fill out every option.");
			return true;
		}else{
			// Check if the type is being set properly
			try {
				Double.parseDouble(cost);
				Integer.parseInt(quantity);
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
				return true;
			}
			
		}
		
		return false;
	}
	
	
	/** Add Item to the List
	 * 
	 * @param JTextArea text_area
	 * @param String cost
	 * @param String item
	 * @param String quantity
	 * 
	 */
	
	public void addItem(JTextArea text_area, String cost, String item, String quantity) {
		text_area.append(item  + " | $" + cost + " | " + quantity+ "\n");
	}
	
	/** Calculate Total Cost of Goods
	 * 
	 * @param String result
	 * @param String cost
	 * @param Stringquantity
	 * @return String
	 * 
	 */
	
	public String totalCost(String result, String cost, String quantity) {
		
		Double new_result = Double.parseDouble(result);
		new_result += (Double.parseDouble(cost) * Double.parseDouble(quantity));
		
		return String.valueOf(new_result);
	}
	
}

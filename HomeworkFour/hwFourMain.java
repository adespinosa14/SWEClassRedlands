package HomeworkFour;

/**
 * 
 * @author Andrew Espinosa
 * @version 1.0
 * 
 */

public class hwFourMain {

	/** Check if we can open the window
	 * 
	 * @param args
	 * @apiNode If the window can not be opened, we throw an exceptions
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Determine whether we can build out the frame
		try {
			
			WindowBuilder frame = new WindowBuilder();
			frame.setVisible(true);
			
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}

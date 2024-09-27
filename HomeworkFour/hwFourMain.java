package HomeworkFour;

public class hwFourMain {

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

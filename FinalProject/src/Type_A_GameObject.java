package FinalProject.src;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Type_A_GameObject extends GameObject implements KeyListener{

	public Type_A_GameObject(int x, int y) {
		super(x, y);
		setDirection(Direction.UP);
		
		imageList = new LinkedList<Icon>();
		imageList.add(new ImageIcon("FinalProject/images/Type_A_Up.png"));
		imageList.add(new ImageIcon("FinalProject/images/Type_A_Down.png"));
	}

	public void move(Canvas c) {
		Icon icon = getCurrentImage();
		
		int iconHeight 	 = icon.getIconHeight();
		int canvasHeight = (int) c.getSize().getHeight();
		switch(getDirection()) 
		{
			case Direction.UP:
				setY(getY() - getVelocity());
				if(getY() < 0) 
				{
					setDirection(Direction.DOWN);
				}
				break;
			case Direction.DOWN:
				setY(getY() + getVelocity());
				if(getY() + iconHeight > canvasHeight) 
				{
//					setY((int) (canvasHeight - iconHeight));
					setDirection(Direction.UP);
				}
				break;
		}
		
	}

	public void setImage() {
		switch(getDirection()) 
		{
			case Direction.UP:
				currentImage = 0;
				break;
			case Direction.DOWN:
				currentImage = 1;
				break;
		}
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

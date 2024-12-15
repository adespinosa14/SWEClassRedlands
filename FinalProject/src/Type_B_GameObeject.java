package FinalProject.src;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Type_B_GameObeject extends GameObject implements KeyListener{

	public Type_B_GameObeject(int x, int y) {
		super(x, y);
		
		setDirection(Direction.UP);
		setPlayerStatus(false);
		imageList = new LinkedList<Icon>();
		imageList.add(new ImageIcon("FinalProject/images/Type_B__Up.png"));
		imageList.add(new ImageIcon("FinalProject/images/Type_B_Down.png"));
		imageList.add(new ImageIcon("FinalProject/images/Type_B_Left.png"));
		imageList.add(new ImageIcon("FinalProject/images/Type_B_Right.png"));
	}

	
	public void move(Canvas c) {
		Icon icon = getCurrentImage();
		int iconHeight	 = icon.getIconHeight();
		int iconWidth	 = icon.getIconWidth();
		int canvasHeight = (int) c.getSize().getHeight();
		int canvasWidth	 = (int) c.getSize().getWidth();
		
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
				if(getY() + iconHeight > canvasHeight - 200) 
				{
					setDirection(Direction.LEFT);
				}
				break;
			case Direction.LEFT:
				setX(getX() + getVelocity());
				if(getX() + iconWidth > canvasWidth) 
				{
					setDirection(Direction.RIGHT);
				}
				break;
			case Direction.RIGHT:
				setX(getX() - getVelocity());
				if(getX() < 200) 
				{
					setDirection(Direction.UP);
				}
				break;
			default:
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
			case Direction.LEFT:
				currentImage = 2;
				break;
			case Direction.RIGHT:
				currentImage = 3;
				break;
			default:break;
		}
	}


	public void keyTyped(KeyEvent e) {}

	public void keyPressed(KeyEvent e) {
		if(getPlayerStatus() == true)
		  {
		    if (e.getKeyCode() == KeyEvent.VK_UP) {
		      setDirection(Direction.UP);
		    }
		    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
		      setDirection(Direction.DOWN);
		    }
		    if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
		      setDirection(Direction.LEFT);
		    }
		    if (e.getKeyCode() == KeyEvent.VK_LEFT) {
		      setDirection(Direction.RIGHT);
		    }
		    if (e.getKeyCode() == KeyEvent.VK_TAB) {
		        System.out.println("Tab Pressed");
		      }
		  }
	}

	public void keyReleased(KeyEvent e) {
		if(getPlayerStatus() == true) 
		{
		    if (e.getKeyCode() != KeyEvent.VK_TAB) {
		        setDirection(Direction.NONE);
		      }
		}
	}

}

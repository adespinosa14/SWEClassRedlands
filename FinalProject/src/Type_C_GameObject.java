package FinalProject.src;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Type_C_GameObject extends GameObject implements KeyListener
{

	public Type_C_GameObject(int x, int y) 
	{
		super(x, y);
		setPlayerStatus(false);
		setDirection(Direction.LEFT);
		imageList = new LinkedList<Icon>();
		imageList.add(new ImageIcon("FinalProject/images/Type_C_Left.png"));
		imageList.add(new ImageIcon("FinalProject/images/Type_C_Right.png"));
	}

	public void move(Canvas c) 
	{
		Icon icon = getCurrentImage();
		int iconWidth	 = icon.getIconWidth();
		int canvasWidth	 = (int) c.getSize().getWidth();
		switch(getDirection()) 
		{
			case Direction.RIGHT:
				setX(getX() - getVelocity());
				if(getX() < 0) 
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
		}
	}

	public void setImage() 
	{
		switch(getDirection()) 
		{
			case Direction.RIGHT:
				currentImage = 1;
				break;
			case Direction.LEFT:
				currentImage = 0;
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

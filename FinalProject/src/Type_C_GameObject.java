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
		setDirection(Direction.LEFT);
		imageList = new LinkedList<Icon>();
		imageList.add(new ImageIcon("FinalProject/images/Type_C_Left.png"));
		imageList.add(new ImageIcon("FinalProject/images/Type_C_Right.png"));
	}

	public void move(Canvas c) 
	{
		Icon icon = getCurrentImage();
		int iconWidth	 = icon.getIconWidth();
		int iconHeight = icon.getIconHeight();
		int canvasHeight = (int) c.getSize().getHeight();
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
	
	public void playerState() 
	{
		
	}

	public void keyTyped(KeyEvent e) 
	{
		
	}

	public void keyPressed(KeyEvent e) 
	{
		
	}

	public void keyReleased(KeyEvent e) 
	{
		
	}

}

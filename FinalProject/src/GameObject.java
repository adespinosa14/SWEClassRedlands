package FinalProject.src;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.util.List;
import javax.swing.Icon;


//GENERAL GAME OBJECT
public abstract class GameObject {
	//EACH GAME OBJECT HAS AN X,Y LOCATION, VELOCITY, AND A DIRECTION

	private int x;
	private int y;
	private int velocity;
	private int direction;
	private boolean playerStatus;
	
	//EACH GAME OBJECT CAN HAVE A COLLECTION OF IMAGES
	protected List<Icon> imageList;
	protected int currentImage; 

	public GameObject(int x, int y) {
		this.x = x;
		this.y = y;
		playerStatus = false;
		velocity = 0;
		currentImage = 0;
	}

	public void draw(Component c, Graphics g) {
		imageList.get(currentImage).paintIcon(c, g, x, y);
		if(playerStatus == true) {
			int thickness = 1;
			Color red = Color.red;
			g.setColor(red);
	        g.drawRect(x + thickness / 2, y + thickness / 2, getCurrentImage().getIconWidth() - thickness, getCurrentImage().getIconHeight() - thickness);
		}
	}

	// SETTERS AND GETTERS

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}

	public int getVelocity() {
		return velocity;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public Icon getCurrentImage() {
		return imageList.get(currentImage);
	}
	
	public boolean getPlayerStatus() {
		return playerStatus;
	}

	public void setPlayerStatus(boolean playerStatus) {
		this.playerStatus = playerStatus;
	}
	
	//ABSTRACT METHODS
	public abstract void move(Canvas c);
	public abstract void setImage();

}

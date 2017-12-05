import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
/**
 * image class
 * @author PC 12
 *
 */
public class Img
{
	private Image _image;
	private int x, y, width, height;
	/**
	 * constructor that initialize new image with location(x,y) and size(width,height)
	 * @param path
	 * @param x:x value of the image
	 * @param y:y value of the image
	 * @param width:the width of the image
	 * @param height:the height of the image
	 */
	public Img(String path, int x, int y, int width, int height)
	{
		_image = new ImageIcon(this.getClass().getClassLoader().getResource(path)).getImage(); 
		
		setImgCords(x, y);
		setImgSize(width, height);
	}
	/**
	 * method that get Graphics g and draw new image with value of x,y,width and height
	 * @param g
	 */
	public void drawImg(Graphics g) 
	{
		Graphics2D g2d = (Graphics2D) g;
        		g2d.drawImage(_image, x, y, width, height, null);
	}
	
	public void setImgCords(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public void setImgSize(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	public void setImg(Image image)
	{
		_image = image;
	}
}



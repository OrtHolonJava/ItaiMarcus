import java.awt.Graphics;

import javax.swing.JPanel;

import Map.Map;

public class MapPanel extends JPanel
{
	private int _numberOfRows;
	private int _numberOfCols;
	private int _size;
	private Img _background;
	private Img _image;
	private Map _map;
	public MapPanel()
	{
		_numberOfCols = 10;
		_numberOfRows = 10;
		_size = 5;
		_background = new Img("Images\\background.jpg",0, 0, 2280, 1720);
		_image = new Img("images\\Plane.jpg", 0, 0, 0, 0);
		_map = new Map(500,500,"Maps\\file1.xml");
	}
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);
		_background.drawImg(g);
		for (int i=0; i< _size; i++)
		{
			for(int j=0; j<_map.getsize(); j++)
			{
				if ((_map.getmap()[i][j] & 1) != 0) // BrownBlock
				{
					_image.setImgCords((j * _size), (i) * _size);
					_image.drawImg(g);
				}
			}
		}
	}

}

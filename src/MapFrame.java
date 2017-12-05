import javax.swing.JFrame;

public class MapFrame extends JFrame
{
	private MapPanel _mp;
	public MapFrame()
	{
		super();
		_mp = new MapPanel();
		add(_mp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,600);
		setVisible(true);
	}

}

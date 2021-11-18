import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class GameController extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//storage classes for characters
	private Frog myFrog;
	private Car myCar;
	
	
	//labels for graphics
	private JLabel frogLabel, carLabel;
	private ImageIcon frogImage, carImage;
	
	//container
	private Container myContainer;
	
	//button
	private JButton HideCarButton;
	
	public GameController()
	{
		super ("Frogger");
		setSize(GameProperties.SCREEN_WIDTH,GameProperties.SCREEN_HEIGHT);
		
		myFrog = new Frog();
		frogLabel = new JLabel();
		frogImage = new ImageIcon(getClass().getResource(myFrog.getFileName()));
		frogLabel.setIcon(frogImage);
		frogLabel.setSize(myFrog.getWidth(), myFrog.getHeight());
		
		myCar = new Car();
		carLabel = new JLabel();
		carImage = new ImageIcon(getClass().getResource(myCar.getFileName()));
		carLabel.setIcon(carImage);
		carLabel.setSize(myCar.getWidth(), myCar.getHeight());
		
		myContainer = getContentPane();
		myContainer.setBackground(Color.gray);
		setLayout(null);
		
		myFrog.setX(100);
		myFrog.setY(250);
		
		add(frogLabel);
		add(carLabel);
		carLabel.setVisible(myCar.getVisible());
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	

	public static void main(String[]args) 
	{
		GameController myGame = new GameController();
		myGame.setVisible(true);
		
	}

}

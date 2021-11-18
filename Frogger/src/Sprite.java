
public class Sprite {
	
	protected int x,y;
	protected int width,height;
	protected String fileName;
	
	public int getX() 
	{
		return x;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public int getY() 
	{
		return y;
	}

	public void setY(int y) 
	{
		this.y = y;
	}

	public int getWidth() 
	{
		return width;
	}

	public void setWidth(int width) 
	{
		this.width = width;
	}

	public int getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}

	public String getFileName() 
	{
		return fileName;
	}

	public void setFileName(String fileName) 
	{
		this.fileName = fileName;
	}

	public Sprite() {
		super();
		this.x = 0;
		this.y = 0;
		this.height = 0;
		this.width = 0;
		this.fileName = "";
		
	}

	public Sprite(int x, int y, int width, int height, String fileName) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.fileName = fileName;
	}

	public Sprite(int width, int height, String fileName) {
		super();
		this.x = 0;
		this.y = 0;
		this.width = width;
		this.height = height;
		this.fileName = fileName;
	}
	
	public void Display()
	{
		System.out.println("X,Y:" + this.x+ "," + this.y);
	}
	
	
	
	
	

}

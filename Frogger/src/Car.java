public class Car extends Sprite {
	
	private Boolean visible, moving; 
	
	public Boolean getVisible() {
		return visible;
	}
	
	public Boolean getMoving() {
		return moving;
	}
	
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	
	public void setMoving(Boolean moving) {
		this.moving = moving;
	}
	
	public Car() {
		super(124, 200, "Truck_left.png");
		this.visible = true;
		this.moving = false; // so that it doesn't start moving automatically
	}
	
	public void hide() {
		this.visible = false;
	}
	
	public void show() {
		this.visible = true;
	}
	
	public void Display()
	{
		System.out.println("X,Y/vis:" + this.x + "," + this.y + "/" + this.visible);
	}
}



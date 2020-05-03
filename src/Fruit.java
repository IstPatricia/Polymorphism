
public class Fruit {

	private String shape;
	private String color;
	
	public String getShape() {
		return shape;
	}

	public String getColor() {
		return color;
	}
	
	public Fruit(String shape, String color) {
		this.shape= shape;
		this.color = color;
	}
	
	public void printFruit() {
		System.out.println("This is a generic fruit");
	}
}

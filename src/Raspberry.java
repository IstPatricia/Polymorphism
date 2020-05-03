
public class Raspberry extends Fruit {

	private double weight;
	private String taste;

	public Raspberry(String shape, String color, double weight, String taste) {
		super(shape, color);
		this.weight = weight;
		this.taste = taste;
	}

	@Override
	public void printFruit() {
		System.out.println("This is raspberry and has a " + super.getColor() + " color, a " + super.getShape()
				+ " shape, weights " + weight + " g. and tastes " + taste);

	}

	public void printRaspCharact(double var) {
		System.out.println("Double characteristic: " + var);
	}
	
	public void printRaspCharact(String s) {
		System.out.println("String characteristic: " + s);
	}
}

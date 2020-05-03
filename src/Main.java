
public class Main {

	public static void main(String[] args) {

		Fruit fruit = new Fruit("Any shape", "Any color");
		Fruit raspberry1 = new Raspberry("diamond", "red", 0.2, "bitter-sweet");
		Raspberry raspberry2 = new Raspberry("oval", "dark red", 0.5, "sweet");

		fruit.printFruit();
		raspberry1.printFruit();
		raspberry2.printFruit();
		System.out.println();
		
		System.out.println("Raspberry characteristics: ");
		raspberry2.printRaspCharact(23);
		raspberry2.printRaspCharact("Raspberry");
	}

}

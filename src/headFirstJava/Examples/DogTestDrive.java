package headFirstJava.Examples;

public class DogTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog one = new Dog();
		one.setSize(70);
		System.out.println("Dog one size is: " + one.getSize());
		one.bark(2);

		Dog two = new Dog();
		two.setSize(15);
		System.out.println("Dog two size is: " + two.getSize());
		two.bark(3);

		Dog three = new Dog();
		three.setSize(10);
		System.out.println("Dog two size is: " + three.getSize());
		three.bark(1); // how many time to bark was done , by Pavlo
		System.out.print("");
	}
}

package headFirstJava.Examples;

public class ComparingVariebles {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 3;
		if (a == b) {
			System.out.println("a = b");
		} else {
			System.out.println("a not b");
		}
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		Dog d3 = d1;
		d3.name = "bob";
		d3.setSize(15);
		d1.name = "Adolf";
		d1.setSize(20);
		System.out.println("d1 size - " + d1.getSize());
		
		if (d1 == d2) {
			System.out.println("d1 = d2");
		} else {
			System.out.println("d1 not d2");
		}
		
		if (d1 == d3) {
			System.out.println("d1 = d3");
		} else {
			System.out.println("d1 not d3");
		}
		if (d2 == d3) {
			System.out.println("d2 = d3");
		} else {
			System.out.println("d2 not d3");
		}
		
		if (d1.equals(d3)) {
			System.out.println("d1 = d3");
		} else {
			System.out.println("d1 not d3");
		}
	}

}

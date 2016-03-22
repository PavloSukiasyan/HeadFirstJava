package headFirstJava.Examples;

class Dog { // Making your first object - page 60 HeadFirstJava.pdf

	private int size;

	public int getSize() { // Encapsulating the Good Dog class
		return size;
	}

	public void setSize(int s) {
		size = s;
	}

	String breed;
	String name;
	int numOfBarks;

	void bark(int numOfBarks) {
		if (size > 60) {
			while (numOfBarks > 0) {
				System.out.println("Wooof, Wooof!");
				numOfBarks = numOfBarks - 1;
			}
		} else if (size > 14) {
			while (numOfBarks > 0) {
				System.out.println("Ruff, ruff!");
				numOfBarks = numOfBarks - 1;
			}
		} else {
			while (numOfBarks > 0) {
				System.out.println("Yip, Yip, Yip!");
				numOfBarks = numOfBarks - 1;
			}
		}
	}
}
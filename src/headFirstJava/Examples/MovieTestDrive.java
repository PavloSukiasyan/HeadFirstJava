package headFirstJava.Examples;

public class MovieTestDrive {

	public static void main(String[] args) {
		
		Movie one = new Movie();
		one.title = "Avengers, Age of Ultron";
		one.genre = "Action";
		one.rating = 7;
		System.out.println(one.title + " " + one.genre + " " + one.rating);
		
		Movie two = new Movie();
		two.title = "Mad Max";
		two.genre = "Action";
		two.rating = 8;
		two.playIt();
		
		Movie three = new Movie();
		three.title = "Ritual";
		three.genre = "Horror";
		three.rating = 5;
		three.playIt();
	}

} // Making and testing Movie objects - page 61 HeadFirstJava.pdf
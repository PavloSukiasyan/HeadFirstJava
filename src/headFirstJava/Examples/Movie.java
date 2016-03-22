package headFirstJava.Examples;

class Movie {
	String title;
	String genre;
	int rating;
	
	void playIt(){
		System.out.print("Playing the movie - " + "\"" + title + "\"" + ","); // "+ title" part added by Myself
		System.out.print(" Genre - " + "\"" + genre + "\""+ ","); //  added by Myself
		System.out.println(" Rating - " + "\"" + rating + "\""); //  added by Myself
	}
} // Making and testing Movie objects - page 61 HeadFirstJava.pdf
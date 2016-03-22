package headFirstJava.Examples.GuessGame;

public class GuessGame { // page 63
	
	Player p1;		/*	GuessGame has three instance variables for the three Player objects*/
	Player p2;
	Player p3;

	public void startGame() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player(); /*create three Player objects and assign them to the three Player instance variables*/
		
		int guessp1 = 0;
		int guessp2 = 0; /*declare three variables to hold the three guesses the Players make*/
		int guessp3 = 0;
		
		boolean p1isRight = false;
		boolean p2isRight = false;/*declare three variables to hold a true or false based on the player’s answer*/
		boolean p3isRight = false;
		
		int targetNumber = (int) (Math.random() * 10);/*make a ‘target’ number that the players have to guess */
		System.out.println("I'm thinking of a number betwen 0 and 9...");
		System.out.println("I have guessed number - " + targetNumber );
		while (true) {
			p1.guess();
			p2.guess();
			p3.guess();
			
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);
			
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			if (p1isRight || p2isRight || p3isRight) {
				
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("The game has come to an end");
				break;
			} else {
				System.out.println("Start again, please");
			}
			
		}
	}
}

package headFirstJava.Game.SimpleDotCom;

public class SimpleDotComGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfGuesses = 0;
		GameHelper helper = new GameHelper();

		SimpleDotCom theDotCom = new SimpleDotCom();

		int randomNumber = (int) (Math.random() * 5);
		int[] locations = { randomNumber, randomNumber + 1, randomNumber + 2 };
		theDotCom.setLocationCells(locations);
		boolean isAlive = true;

		while (isAlive == true) {
			String guess = helper.getUserInput("Enter a number");
			String result = theDotCom.checkYourself(guess);
			numberOfGuesses++;

			if (result.equals("Kill")) {
				isAlive = false;
				System.out.println("You took " + numberOfGuesses + " guesses");
			}
		}
	}

}

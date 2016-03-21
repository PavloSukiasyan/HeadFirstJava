package headFirstJava.Game.SimpleDotCom;

public class SimpleDotComTestDrive { // page 106

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = { 2, 3, 4 };
		dot.setLocationCells(locations);
		String userGuess = "2";

		dot.checkYourself(userGuess);
	}

}

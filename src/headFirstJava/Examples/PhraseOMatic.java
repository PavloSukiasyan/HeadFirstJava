package headFirstJava.Examples;

public class PhraseOMatic {

	public static void main(String[] args) {

		// make three sets of words to choose from

		String[] wordListOne = { "24/7", "multi-Tier", " 33,000 foot", "B-to-B", "win-win", "Front-end", "web-based",
				"pervasive", "smart", "six-sigma", "smart", "critical-path", "dynamic" };
		String[] wordListTwo = { "empowered", "sticky", " value-added", "strong", "oriented", "positioned", "focused",
				"targeted", "cooperated", "self-managed", "testing", "branded", "super fast" };
		String[] wordListThree = { "process", "tipping point", "solution", "architecture", "core competency", "strategy",
				"mindshare", "portal", "space", "vision", "paraadigm", "mission" };
		
		// find out how many words are in your lists
		
		int oneLenght = wordListOne.length;
		int twoLenght = wordListTwo.length;
		int threeLenght = wordListThree.length;
		
		// generate three random numbers
		int randOne = (int) (Math.random() * oneLenght );
		int randTwo = (int) (Math.random() * twoLenght);
		int randThre = (int) (Math.random() * threeLenght);
		
		// now build a phrase
		String phrase = wordListOne[randOne] + " " + wordListTwo[randTwo] + " " + wordListThree[randThre] ;
		
		// printing our phrase
		System.out.println("What we need is " + phrase);
	}

}
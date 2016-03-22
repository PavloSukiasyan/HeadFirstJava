package headFirstJava.Examples;

public class ShuffleOne {

	public static void main(String[] args) {
/*		A working Java program is all scrambled up
		on the fridge. Can you rearrange the code
		snippets to make a working Java program
		that produces the output listed below?
		Some of the curly braces fell on the floor
		and they were too small to pick up, so feel
		free to add as many of those as you need!*/
		int x = 3;
		while (x > 0) {
			if (x > 2) {
				System.out.print("a");
			}
			x = x - 1;
			System.out.print("-");
			if (x == 2) {
				System.out.print("b c");
			}
			if (x == 1) {
				System.out.print("d" + "\n");
				x = x - 1;
			}
		}
		// "Mixed messages"   p. 47 HeadFirstJava.pdf
		int a = 0;
		int b = 0;
		while (a < 5){ 
			if (b < 5){
					a = a + 1;
				}
				if (b < 3){
					a = a - 1;
			}
				b = b + 2;
			System.out.print(a + "" + b +" "); // Result - "02 14 36 48 "
			a = a + 1;
		}
		// PoolPuzzleOne   p. 48 HeadFirstJava.pdf
		System.out.print("\n");
		int z = 0;
		while (z < 4) {
			System.out.print("a");
			if (z < 1) {
				System.out.print(" ");
			}
			System.out.print("n");
			if (z > 1) {
				System.out.print(" oyster");
				z = z + 2;}
			if (z == 1) {
				System.out.print("noys");
				}
			if (z < 1){
				System.out.print("oisse");
				}
			System.out.println(" ");
			z = z + 1;
			}
		}
	}
package mixedMessages;

public class MixFor5 {

	public static void main(String[] args) {
		// page 121

		int x = 0;
		int y = 30;
		for (int outer = 0; outer < 3; outer++) {
			for (int inner = 4; inner > 1; inner--) {
				x = x + 3; // 54 6
				y = y - 2;
				if (x == 6) {
					break;
				}
				x = x + 3;
			}
			y = y - 2;
		}
		System.out.println(x + " " + y);
	}

}
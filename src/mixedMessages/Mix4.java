package mixedMessages;

public class Mix4 {
	
	int counter = 0;
	
	public static void main(String[] args) {
		
		int count = 0;
		Mix4 [] m4a =new Mix4[20]; // x < 19; (index<1) = 20 1
		int x = 0;
		while (x < 7) {
			m4a[x] = new Mix4();
			m4a[x].counter++;
			count++;
			count= count + m4a[x].maybeNew(x);
			x++;
		}
		
		System.out.println(count + " " + m4a[1].counter);
		
	}
	
	public int maybeNew (int index) {
		if (index<7) {
			Mix4 m4 =new Mix4();
			m4.counter++;
			return 1;
		}
		return 0;
		
	}
		
}

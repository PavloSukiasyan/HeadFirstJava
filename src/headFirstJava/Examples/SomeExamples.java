package headFirstJava.Examples;

public class SomeExamples {

	public static void main(String[] args) {
		// page 75
		int g = 17;
		int y = g;
		y = y + 10; 
		short s;
		s = (short) y; // cast
		byte b = 3;
		byte v = b;
		short n = 12;
		v = (byte) n; 	// cast
		byte k = (byte) 128;
		
		System.out.println("Args are - " + " y is: "+ y +", v is: "+ v + ", k is: "+ k + ", s is: "+ s);
		
		int[] nums;
		nums = new int [3];
		nums [0] = 6 ;
		nums [1] = 7 ;
		nums [2] = 8 ;
		System.out.println (nums[0]);
		
		Dog [] pets;
		pets = new Dog [7];
		pets [0] = new Dog();
		pets [1] = new Dog();
		pets [0].name = "Rex";
		Dog fido = new Dog();
		fido.name = "Fido";
		
		System.out.println (pets[0].name);
		
		int ls = 17; 
		int hls ;
		if (ls%2 == 1) { // check for "pair" or "an odd" value
			hls = ls / 2 + 1;
		} else {
			hls = ls / 2;
		}
		System.out.println(hls);
	}

}

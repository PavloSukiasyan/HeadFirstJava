package headFirstJava.Examples.CodeMagnets;

class TestArrays {

	public static void main(String[] args) {
		// page 87
		String [] islands = new String[4];
		
		islands [0] = "Bermuda"; 
		islands [1] = "Fiji";
		islands [2] = "Azores";
		islands [3] = "Cozumel";
		
		int [] index = new int [4];
		
		index[0] = 1;
		index[1] = 3;
		index[2] = 0;
		index[3] = 2;
				
		int y = 0;
		
		int ref;
		
		while (y < 4) {
			ref = index[y];
			y = y + 1;
			System.out.print(" island = ");
			System.out.println(islands[ref]);
			
		}
	}

}

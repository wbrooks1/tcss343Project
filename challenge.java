package tcss343HW4;

public class challenge {

	
	int[][] field;
	
	public challenge(int[][] theStones) {
		field = new int[theStones.length][theStones.length];
		for(int i = 0; i < field.length; i++) {
			for(int j = 0; j < field.length; j++) {
				if(theStones[i][j] == 1) {
					field[i][j] = 1;
				} else {
					field[i][j] = 0;
				}
			}

		}
		for(int i = 0; i < field.length; i++) {
			for(int j = 0; j < field.length; j++) {
				System.out.print(field[i][j] + " ");
			}
			System.out.print("\n");
		}
		
	}
	
	
	
	public static void main (String args[]) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int[][] stones = new int[n][n];
		for(int i = 2; i < args.length; i+=2) {
			stones[Integer.parseInt(args[i])][Integer.parseInt(args[i+1])] = 1;
		}
		challenge chal = new challenge(stones);
	}
}




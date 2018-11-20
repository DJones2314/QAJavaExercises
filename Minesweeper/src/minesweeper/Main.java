package minesweeper;

//import java.util.scanner;

public class Main {
	
	public static void main(String[] args) {
		
		int[][] multiDimension = new int [10][10];
		
		int Rj = (int)(Math.random() * 10);
		
		int Ri = (int)(Math.random() * 10);
		multiDimension[Rj][Ri] = 1;
		
		for(int i = 0; i < multiDimension.length; i++) {
			//ROW
			for(int j = 0; j < multiDimension.length; j++) {
				System.out.print("[" + multiDimension[j][i] + "]");
			}
			System.out.println();
		}
	}

}

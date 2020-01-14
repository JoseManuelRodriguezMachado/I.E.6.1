package ej3;

public class matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[][] = new int[5][8];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("");
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int)(Math.random()*100);
				System.out.print(array[i][j]+"\t");
			}
		}
	}
}

package ej14;

public class suma_matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[4][4];
		int b[][] = new int[4][4];
		int c[][] = new int[4][4];
		
		System.out.println("Matriz A");
		for (int i = 0; i < a.length; i++) {
			System.out.println("");
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random()*100);
				System.out.print(a[i][j]+"\t");
			}
		}
		
		System.out.println("");
		System.out.println("\nMatriz B");
		for (int i = 0; i < b.length; i++) {
			System.out.println("");
			for (int j = 0; j < b[i].length; j++) {
				b[i][j] = (int)(Math.random()*100);
				System.out.print(b[i][j]+"\t");
			}
		}
		
		System.out.println("");
		System.out.println("\nMatriz al sumar A y B");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				
			}
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("");
			for (int j = 0; j < c.length; j++) {
				System.out.print(c[i][j]+"\t");
			}
		}
	}
}

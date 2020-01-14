package ej15;

public class matriz_posicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = new int[4][4];
		int posicion1 = 0, posicion2 = 0, mayor = 0;
		int posicion3 = 0, posicion4 = 0, menor = 100;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("");
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random()*100);
				System.out.print(a[i][j]+"\t");
				if (a[i][j]>mayor) {
					mayor = a[i][j];	
				}
				if (a[i][j]==mayor) {
					posicion1 = i;
					posicion2 = j;
				}
				if (a[i][j]<menor) {
					menor = a[i][j];	
				}
				if (a[i][j]==menor) {
					posicion3 = i;
					posicion4 = j;
				}
			}	
		}
		
		System.out.println("\nel mayor es: "+mayor+" y se encuentra en la posicion ("+posicion1+","+posicion2+")");
		System.out.println("\nel menor es: "+menor+" y se encuentra en la posicion ("+posicion3+","+posicion4+")");
	}

}

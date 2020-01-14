package ej16;

public class sumapar_mayorimpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		int suma = 0, mayor = 0;
		
		for (int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.print(a[i]+"\t");
			for (int j = 0; j < a.length; j+=2) {
				suma = suma + a[i];
			}
			for (int k = 1; k < a.length; k+=2) {
				if (a[i]>mayor) {
					mayor = a[i];
				}
			}
		}
		
		System.out.println("\nLa suma de las posiciones pares es "+suma
				+"\nEl mayor de la posicion impar es "+mayor);
	}
}

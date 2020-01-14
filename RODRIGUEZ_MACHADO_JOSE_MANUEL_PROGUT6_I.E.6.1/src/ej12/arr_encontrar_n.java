package ej12;

import java.util.Scanner;

public class arr_encontrar_n {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		int n=0;
		boolean m = false;
		
		Scanner tec = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("Introduzca el %d numero:",i+1);
			a[i] = tec.nextInt();
		}
		
		System.out.println("el vector es el siguiente:");
		
		for (int j = 0; j < a.length; j++) {
			System.out.print(a[j]+"\t");
		}
		
		System.out.println("\nIntroduzca un numero para buscarlo:");
		n = tec.nextInt();
		
		for (int j = 0; j < a.length; j++) {
			if (n == a[j]) {
				System.out.println("\nel numero se encuentra en el array");
				m = true;
			} 
		}
		
		if (m == false) {
			System.out.println("\nel numero no esta");
		}
		
			
	}
}

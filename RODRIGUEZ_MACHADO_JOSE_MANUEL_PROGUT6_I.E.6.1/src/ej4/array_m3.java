package ej4;

import java.util.Scanner;

public class array_m3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[5];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Introduzca el %dº numero: ", i+1);
			array[i] = teclado.nextInt();
			if (i/3==0) {
				i = array[0];
			}
		}
		
		for (int j = 0; j < array.length; j++) {
			System.out.print(array[j]+" ");
		}
	}
}

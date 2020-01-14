package ej1;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[5];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i <array.length; i++) {
			System.out.printf("introduzca numero %d: ", i+1);
			array[i] = teclado.nextInt();
		}
		
		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}
	}
}

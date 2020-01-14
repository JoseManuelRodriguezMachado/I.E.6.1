package ej6;

import java.util.Scanner;

public class contador_en_arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[25];
		int n = 0, cont = 0;
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Introduzca el %dº numero: ", i+1);
			array[i] = teclado.nextInt();
		}
		
		System.out.println("introduzca un numero: ");
		n = teclado.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				cont++;
			}
		}

		System.out.println("el "+n+" se ha repetido "+cont+" veces");

	}
}

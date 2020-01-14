package ej7;

import java.util.Scanner;

public class arr_inverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[20];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.printf("Introduzca el %dº numero: ", i+1);
			array[i] = teclado.nextInt();
		}
		
		for (int j = array.length - 1; j >= 0; j--) {
			System.out.println(array[j]);
		}

	}

}

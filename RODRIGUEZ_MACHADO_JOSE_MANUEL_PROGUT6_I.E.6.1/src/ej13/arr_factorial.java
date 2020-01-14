package ej13;

import java.util.Scanner;

public class arr_factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long a[] = new long[20];
		long factorial = 1;
		
		Scanner tec = new Scanner(System.in);
		
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%dº numero: ",i+1);
			int n = tec.nextInt();
			
			for (long j = 2; j <= n; j++) {
				factorial = factorial * j;
			}
			
			a[i]=factorial;
			factorial = 1;
		}
		
		System.out.println("el siguiente array son los factoriales de los numeros introducidos");
		
		for (int k = 0; k < a.length; k++) {
			System.out.println(a[k]+"\t");
		}

	}

}

package ej11;

public class vectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = new int[15];
		int B[] = new int[15];
		int C[] = new int[15];
		int mayor = 0;
		
		for (int i = 0; i < A.length; i++) {
			System.out.print((A[i]=(int)(Math.random()*11))+"\t");
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < B.length; i++) {
			System.out.print((B[i]=(int)(Math.random()*11))+"\t");
		}
		
		System.out.println(" ");
		
		for (int i = 0; i < C.length; i++) {
			C[i] = A[i] + B[i];
			if (C[i] > mayor) {
				mayor = C[i];
			}
			
		}
		
		for (int j = 0; j < C.length; j++) {
			System.out.print(C[j]+"\t");
		}
		
		System.out.println("\nel mayor de C es: "+mayor);

	}

}

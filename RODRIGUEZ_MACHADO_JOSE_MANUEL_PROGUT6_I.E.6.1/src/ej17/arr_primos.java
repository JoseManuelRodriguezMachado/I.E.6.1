package ej17;

public class arr_primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[5];
		int impar = 0;
		int i;
		
		for ( i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*100);
			System.out.print(a[i]+"\t");
			if ((a[i]%2)==0) {
				impar++;
				a[i] = i;
			}
		}
		
		if (impar <=2) {
			System.out.println("\n"+i+" es impar");
		}else {
			System.out.println("no hay impares");
		}
	}
}

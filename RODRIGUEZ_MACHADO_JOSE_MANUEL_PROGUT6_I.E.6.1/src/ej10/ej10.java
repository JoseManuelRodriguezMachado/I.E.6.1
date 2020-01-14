package ej10;

public class ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[100];
		int mayor = 0, menor = 80, total = 0, cont = 0;
		double media = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]=(int)(Math.random()*81+10));
			total += array[i];
			if (array[i] > mayor) {
				mayor = array[i];
			}
			if (array[i] < menor) {
				menor = array[i];
			}
			int n = 0;
			if (n == array[i]) {
				cont++;
			}
		}
		
		media = total/array.length;
		System.out.println("el mayor es: "+mayor
				+"\nel menor es: "+menor
				+"\nel valor que mas se repite es: "+cont
				+"\nla media es: "+media);
	}

}

package ej8;

public class arr_1mayor_2mayor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[15];
		int primero = 0, segundo = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((array[i]=(int)(Math.random()*100))+"\t");
			if (array[i] > primero) {
				primero = array[i];
			}else if (array[i] > segundo) {
				segundo = array[i];
			}
		}
		System.out.println("\nel numero mas grande es: "+primero+" seguido de: "+segundo);
	}
}

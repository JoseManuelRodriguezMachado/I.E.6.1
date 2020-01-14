package ej5;

public class arr_mayor_posicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[20];
		int num_mayor = 0, posicion = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]=(int)(Math.random()*100));
			if (array[i]>num_mayor) {
				num_mayor = array[i];	
			}
			if (array[i]==num_mayor) {
				posicion = i;
			}
		}
		System.out.println("el nº mayor es: "+num_mayor+" y su posicion es: "+posicion);
	}
}

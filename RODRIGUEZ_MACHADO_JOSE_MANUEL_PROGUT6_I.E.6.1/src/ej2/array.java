package ej2;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[5];
		int total = 0;
		double media = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]=(int)(Math.random()*100));
			total += array[i];
			
		}
		
		media = total/array.length;
		System.out.println("La suma total es de: "+total);
		System.out.println("La media es de: "+media);
	}
}
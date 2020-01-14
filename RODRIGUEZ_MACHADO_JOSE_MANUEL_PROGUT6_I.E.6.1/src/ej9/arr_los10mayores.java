package ej9;

public class arr_los10mayores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int[1000];
		int primero = 0, segundo = 0, tercero = 0, cuarto = 0, quinto = 0;
		int sexto = 0, septimo = 0, octavo = 0, noveno = 0, decimo = 0;
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]=(int)(Math.random()*100));
			if (array[i] > primero) {
				primero = array[i];
			}else if(array[i] > segundo) {
				segundo = array[i];
			}else if(array[i] > tercero) {
				tercero = array[i];
			}else if(array[i] > cuarto) {
				cuarto = array[i];
			}else if(array[i] > quinto) {
				quinto = array[i];
			}else if(array[i] > sexto) {
				sexto = array[i];
			}else if(array[i] > septimo) {
				septimo = array[i];
			}else if(array[i] > octavo) {
				octavo = array[i];
			}else if(array[i] > noveno) {
				noveno = array[i];
			}else if(array[i] > decimo) {
				decimo = array[i];
			}
		}
		System.out.println("el 1º mas grande es: "+primero
				+"\nel 2º es: "+segundo
				+"\nel 3º es: "+tercero
				+"\nel 4º es: "+cuarto
				+"\nel 5º es: "+quinto
				+"\nel 6º es: "+sexto
				+"\nel 7º es: "+septimo
				+"\nel 8º es: "+octavo
				+"\nel 9º es: "+noveno
				+"\nel 10º es: "+decimo);
	}
}


package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		byte delete = 0;
		String[] array = new String[5];
		for(int i=0;i<5;i++) {
			System.out.println("Ingrese un nombre: ");
			array[i] = scanner.next();
		}
		int i=0;
		while(i<5) {
			System.out.print(array[i] + ", ");
			i++;
		}
		System.out.println(" ");
		System.out.println("Tamaño del array: " + array.length);
		do {
			System.out.print("Ingrese una posicion a eliminar del 0 al 4: ");
			delete=scanner.nextByte();
		}while(delete<0 || delete>4);
		for(int e = delete;e<4;e++) {
			array[e] = array[e + 1];
		}
		array[4] = null;
		i=0;
		while(i<5) {
			System.out.print(array[i] + ", ");
			i++;
		}
		scanner.close();
	}
	
}

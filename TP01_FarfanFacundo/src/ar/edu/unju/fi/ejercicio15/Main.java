package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		do {
			System.out.println("Ingrese un numero entre 5 y 10:");
			number = scanner.nextInt();
		}while(number <5 || number >10);
		String[] array = new String[number];
		for(int i=0;i<number;i++) {
			System.out.println("Ingrese un nombre: ");
			array[i] = scanner.next();
		}
		for(int i=0;i<number;i++) {
			System.out.println("En la posicion " + i + " esta: " + array[i]);
		}
		System.out.println();
		for(int i=number-1;0<=i;i--) {
			System.out.println("En la posicion " + i + " esta: " + array[i]);
		}
		scanner.close();
	}
}

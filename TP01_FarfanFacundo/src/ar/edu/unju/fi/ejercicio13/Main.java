package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[8];
		
		for(int i=0;i<8;i++) {
			System.out.println("Ingrese un numero: ");
			array[i] = scanner.nextInt();
		}
		for(int i=0;i<8;i++) {
			System.out.println("En la posicion " + i + " esta el número " + array[i]);
		}
		
		scanner.close();
	}
}

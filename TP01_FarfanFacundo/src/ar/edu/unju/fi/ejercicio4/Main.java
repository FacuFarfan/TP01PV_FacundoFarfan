package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero del 0 al 10: ");
		int number = scanner.nextInt();
		
		if(number>=0 && number<=10) {
			int factorial = 1;
			int counter = 1;
			while(counter <= number) {
				factorial *= counter;
				counter++;
			}
			System.out.println("El factorial de " + number + " es: " + factorial);
		}else {
			System.out.println("El numero que ingreso esta fuera de rango");
		}
		scanner.close();
	}
}

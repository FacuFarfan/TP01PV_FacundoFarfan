package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			int triple = number * 3;
			System.out.println("El número ingresado es par.El triple del número es: " + triple);
		}else {
			int doubl = number * 2;
			System.out.println("El número ingresado es impar.El doble del número es: " + doubl);
		}
	}

}

package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingresa un número del 1 al 9: ");
		int number = scanner.nextInt();
		if(number>=1 && number<=9) {
			for(int i = 0; i<=10;i++) {
				System.out.println(number + " X " + i + " = " + (number*i));
			}
		}else {
			System.out.println("El numero ingresado esta fuera de rango");
		}
		scanner.close();
	}
}

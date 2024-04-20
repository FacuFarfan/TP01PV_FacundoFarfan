package ar.edu.unju.fi.ejercicio14;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, sum=0;
		do {
			System.out.println("Ingrese un numero entre 3 y 10:");
			number = scanner.nextInt();
		}while(number <=3 || number >=10);
		int[] array = new int[number];
		for(int i=0;i<number;i++) {
			System.out.println("Ingrese un numero: ");
			array[i] = scanner.nextInt();
		}
		for(int i=0;i<number;i++) {
			System.out.println("En la posicion " + i + " esta el número " + array[i]);
			sum = array[i] + sum;
		}
		System.out.println("La suma total de todos los numeros es: " + sum);
		scanner.close();
	}
}

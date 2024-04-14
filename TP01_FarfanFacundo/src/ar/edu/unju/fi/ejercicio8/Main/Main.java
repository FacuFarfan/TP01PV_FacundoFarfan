package ar.edu.unju.fi.ejercicio8.Main;
import ar.edu.unju.fi.ejercicio8.Model.CalculadoraEspecial;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		CalculadoraEspecial calculator = new CalculadoraEspecial();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese numero para sumatoria: ");
		int n = scanner.nextInt();
		System.out.println(calculator.calcularSumatoria(n));
		System.out.println("Ingrese numero para productorial: ");
		n = scanner.nextInt();
		System.out.println(calculator.calcularProductorial(n));
		scanner.close();
	}
}

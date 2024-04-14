package ar.edu.unju.fi.ejercicio6.Main;
import ar.edu.unju.fi.ejercicio6.Model.Persona;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Persona people1 = new Persona();
		people1.showData();
		
		System.out.println("Ingrese el DNI: ");
		String dni = scanner.nextLine();
		System.out.println("Ingrese el nombre: ");
		String name = scanner.nextLine();
		System.out.println("Ingrese la fecha de nacimiento: ");
		LocalDate birthday = LocalDate.parse(scanner.nextLine());
		System.out.println("Ingrese la Provincia: ");
		String provice = scanner.nextLine();
		Persona people2 = new Persona(dni, name, birthday, provice);
		people2.showData();
		
		System.out.println("Ingrese el DNI: ");
		dni = scanner.nextLine();
		System.out.println("Ingrese el nombre: ");
		name = scanner.nextLine();
		System.out.println("Ingrese la fecha de nacimiento: ");
		birthday = LocalDate.parse(scanner.nextLine());
		Persona people3 = new Persona(dni, name, birthday);
		people3.showData();
		
		scanner.close();
	}
}

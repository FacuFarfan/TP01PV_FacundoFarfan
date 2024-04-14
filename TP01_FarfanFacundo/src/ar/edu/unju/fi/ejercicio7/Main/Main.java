package ar.edu.unju.fi.ejercicio7.Main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.Model.Empleado;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese nombre: ");
		String name = scanner.nextLine();
		System.out.println("Ingrese legajo: ");
		int file = scanner.nextInt();
		System.out.println("Ingrese salario: ");
		double salary = scanner.nextInt();
		
		Empleado employee = new Empleado(name, file, salary);
		employee.showData();
		employee.salaryIncrease();
		employee.showData();
		scanner.close();
	}
}

package ar.edu.unju.fi.ejercicio12.Main;
import java.util.Calendar;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio12.Model.Persona;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calendar birthday = Calendar.getInstance();
		System.out.println("Ingrese un nombre: ");
		String name= scanner.nextLine();
		System.out.println("Ingrese la fecha de nacimiento(aa-mm-dd): ");
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day  = scanner.nextInt();
		birthday.set(Calendar.YEAR, year);
        birthday.set(Calendar.MONTH, month - 1); 
        birthday.set(Calendar.DAY_OF_MONTH, day);
		Persona people = new Persona( name, birthday);
		
		people.showData();
		scanner.close();
	}
}

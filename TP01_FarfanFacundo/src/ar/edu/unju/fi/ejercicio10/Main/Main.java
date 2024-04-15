package ar.edu.unju.fi.ejercicio10.Main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio10.Model.Pizza;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Pizza pizza = new Pizza();
		for(int i=1;i<=3;i++) {
			System.out.println("Ingrese el diametro de la pizza: ");
			int diameter = scanner.nextInt();
			System.out.println("¿Quiere agregar ingredientes especiales?");
			boolean specials = scanner.nextBoolean();
			
			System.out.println("**Pizza "+i+"**");
			System.out.println("Diametro: "+diameter);
			System.out.println("ingredientes especialas: "+ specials);
			System.out.println("Precio Pizza: "+pizza.calcularPrecio(diameter, specials) + "$");
			System.out.println("Area de la pizza: "+pizza.calcularArea(diameter));
			scanner.nextLine();
		}
		scanner.close();
	}
}

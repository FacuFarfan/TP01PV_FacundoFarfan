package ar.edu.unju.fi.ejercicio9.Main;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.Model.Producto;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		for(int i = 1; i<=3;i++) {
			Producto product = new Producto();
			
			System.out.println("Ingrese nombre del producto: ");
			product.setName(scanner.nextLine());
			System.out.println("Ingrese codigo del producto: ");
			product.setCode(scanner.nextLine());
			System.out.println("Ingrese el precio del producto: ");
			product.setPrice(scanner.nextDouble());
			System.out.println("Ingrese el descuento del producto: ");
			product.setDiscount(scanner.nextInt());
			scanner.nextLine();
			
			System.out.println("Nombre: " + product.getName());
			System.out.println("Codigo: " + product.getCode());
			System.out.println("Precio: " + product.getPrice());
			System.out.println("Descuento: " + product.getDiscount());
			System.out.println("Precio con descuento: " + product.calcularDescuento());
			System.out.println();
		}
		scanner.close();
	}
}

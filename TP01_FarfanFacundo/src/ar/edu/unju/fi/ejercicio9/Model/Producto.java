package ar.edu.unju.fi.ejercicio9.Model;

public class Producto {
	private String name;
	private String code;
	private double price;
	private int discount;
	
	public Producto() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public double calcularDescuento() {
		double result = price - (price * discount/100);
		return result;
	}
}

package ar.edu.unju.fi.ejercicio10.Model;

public class Pizza {
	private double diameter;
	private int price;
	private double area;
	private boolean specials;
	private static final int specials20 = 500;
	private static final int specials30 = 750;
	private static final int specials40 = 1000;
	
	public Pizza() {
		
	}
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean getSpecials() {
		return specials;
	}
	public void setSpecials(boolean specials) {
		this.specials = specials;
	}
	
	public static int getSpecials20() {
		return specials20;
	}
	public static int getSpecials30() {
		return specials30;
	}
	public static int getSpecials40() {
		return specials40;
	}
	public int calcularPrecio(int diameter, boolean specials) {
		if (diameter==20 & specials==false) {
			return price=4500;
		} else if (diameter==20 & specials==true){
			return price=5000;
		}else if (diameter==30 & specials==false) {
			return price=4800;
			
		}else if (diameter==30 & specials==true){
			return price=5550;
			
		}else if (diameter==40 & specials==false) {
			return price=5500;
			
		}else {
			return price=6500;
		}
	}
	public double calcularArea(int diameter) {
    	area=(3.14*Math.pow(diameter, 2))/4;
    	return area;
    }
}

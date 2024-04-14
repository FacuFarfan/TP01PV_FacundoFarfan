package ar.edu.unju.fi.ejercicio8.Model;

public class CalculadoraEspecial {
	private int n;
	public CalculadoraEspecial() {
		
	}
	public int getN() {
		return n;
	}
	public void setN() {
		this.n = n;
	}
	public double calcularSumatoria(int n) {
		double result = 0;
		for(int k = 1; k<=n;k++) {
			result += Math.pow(((k*(k+1))/2), 2);
		}
		return result;
	}
	public double calcularProductorial(int n) {
		double result = 1;
		for(int k = 1; k <= n;k++) {
			result *= k*(k+4);
		}
		return result;
	}
}

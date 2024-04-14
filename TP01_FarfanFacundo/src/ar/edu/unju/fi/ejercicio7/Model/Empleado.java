package ar.edu.unju.fi.ejercicio7.Model;

public class Empleado {
	private String name;
	private int file;
	private double salary;
	
	private static final double minimumSalary= 210000; 
    private static final double increase=20000;
    
    public Empleado(String name, int file, double salary) {
    	this.name = name;
    	this.file = file;
    	if(salary >= minimumSalary) {
    		this.salary = salary;
    	}else {
    		this.salary = minimumSalary;
    	}
    }
    public void showData() {
    	System.out.println("Nombre del empleado: " + name);
    	System.out.println("Legajo: " + file);
    	System.out.println("Salario $: " + salary);
    }
    public double salaryIncrease() {
    	return salary = salary + increase;
    }
}

package ar.edu.unju.fi.ejercicio6.Model;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String dni;
	private String name;
	private LocalDate birthday;
	private String province;
	
	public Persona() {
		this.birthday = LocalDate.now();
	}
	
	public Persona(String dni, String name, LocalDate birthday, String province) {
		this.dni = dni;
		this.name = name;
		this.birthday = birthday;
		this.province = province;
	}
	
	public Persona(String dni, String name, LocalDate birthday) {
		this.dni = dni;
		this.name = name;
		this.birthday = birthday;
		this.province = "Jujuy";
	}
	
	public int calculateAge() {
		int age;
		LocalDate now = LocalDate.now();
		Period periodo = Period.between(birthday, now);
		age = periodo.getYears();
		return age;
	}
	public boolean verifyAge(int age) {
		boolean adult = false;
		if(age>=18){
			adult = true;
		}
		return adult;
	}
	public void showData() {
		System.out.println("DNI: " + dni);
		System.out.println("Nombre: " + name);
		System.out.println("Fecha de Nacimiento: " + birthday);
		System.out.println("Provincia: " + province);
		System.out.println("Edad: " + calculateAge());
		if(verifyAge(calculateAge())) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
	}
}

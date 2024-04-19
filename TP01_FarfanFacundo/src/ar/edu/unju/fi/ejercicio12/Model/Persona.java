package ar.edu.unju.fi.ejercicio12.Model;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Persona {
	private String name;
	private Calendar birthday;
	
	public Persona() {
		
	}
	public Persona(String name, Calendar birthday) {
        this.name = name;
        this.birthday = birthday;
    }
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getBirthday() {
		return birthday;
	}
	public void setBirthday(Calendar birthday) {
		this.birthday = birthday;
	}
	
	public int calculateAge() {
		int age;
		Calendar date = Calendar.getInstance();
		date.getTime();
		age = date.get(Calendar.YEAR)-this.getBirthday().get(Calendar.YEAR);
		return age;
	}
	public String zodiac() {
		int day = this.getBirthday().get(Calendar.DAY_OF_MONTH);
		int month = this.getBirthday().get(Calendar.MONTH)+1;
		
		if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Tauro";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Géminis";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cáncer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Escorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagitario";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricornio";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Acuario";
        } else{
            return "Piscis";

        }
	}
	public String season() {
		int month = this.getBirthday().get(Calendar.MONTH)+1;
		if(month >=1 && month <= 3) {
			return "Verano";
		}else if(month >=4 && month <= 6) {
			return "Otoño";
		}else if(month >=7 && month <= 9) {
			return "Invierno";
		}else {
			return "Primavera";
		}
	}
	public void showData() {
		SimpleDateFormat form =new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Nombre: "+ this.getName());
		System.out.println("Fecha nacimiento: "+ form.format(this.getBirthday().getTime()));
		System.out.println("Edad: " + calculateAge());
		System.out.println("Signo del Zodiaco: "+ zodiac());
		System.out.println("Estacion: "+ season());
	}
	
}

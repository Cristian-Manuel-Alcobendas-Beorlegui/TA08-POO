package Ejercicio1;
import java.text.DecimalFormat; // Clase que servirá para dar formato a los valores decimales

public class Main {

	public static void main(String[] args) {
		// 1. Crear objetos de clase Persona
		Persona perso1 = new Persona("Satur", 40, 80.34, 1.73);
		Persona perso2 = new Persona("Verónica", 24, 69.12, 1.65);
		DecimalFormat decimal = new DecimalFormat("0.00"); // Usar la clase DecimalFormat para redondear los decimales a dos dígitos
		
		// 2. Modificar algunos datos de los objetos
		// Objeto "perso1" (DNI)
		perso1.setDni("51203294F");
		// Objeto "perso2" (DNI, sexo)
		perso2.setDni("91234137V");
		perso2.setSexo('M');
		
		// 3. Mostrar los datos de los objetos por pantalla
		// Datos del objeto "perso1"
		System.out.println("DATOS DE LA 1ª PERSONA");
		System.out.println("-----------------------------------------");
		System.out.println("Nombre: " + perso1.getNombre()); // Nombre
		System.out.println("DNI: " + perso1.getDni()); // DNI 
		System.out.println("Edad: " + perso1.getEdad()); // Edad
		System.out.println("Sexo: " + perso1.getSexo()); // Sexo
		System.out.println("Peso: " + decimal.format(perso1.getPeso())); // Peso
		System.out.println("Altura: " + decimal.format(perso1.getAltura())); // Altura
		System.out.println("\n//////////////////////////////////////////////////////\n");
	
		// Datos del objeto "perso2"
		System.out.println("DATOS DE LA 2ª PERSONA");
		System.out.println("-----------------------------------------");
		System.out.println("Nombre: " + perso2.getNombre()); // Nombre
		System.out.println("DNI: " + perso2.getDni()); // DNI
		System.out.println("Edad: " + perso2.getEdad()); // Edad
		System.out.println("Sexo: " + perso2.getSexo()); // Sexo
		System.out.println("Peso: " + decimal.format(perso2.getPeso())); // Peso
		System.out.println("Altura: " + decimal.format(perso2.getAltura())); // Altura
		
		// Fin del programa
	}
}

package Ejercicio3;
import java.text.DecimalFormat; // Clase para dar formato a los valores decimales

public class Main {

	public static void main(String[] args) {
		// 1. Crear los objetos de clase
		DecimalFormat decimal = new DecimalFormat("0.00");
		Electrodomestico elect1 = new Electrodomestico();
		Nevera nev1 = new Nevera("Nevera", "Samsung", "FT-1112", "Gris", 'A', 750.00, 90.00);
		// NOTA: Si cambiamos el color por uno que no esté definido, el color pasará a ser "Blanco"
		
		// 2. Mostrar los datos de los objetos
		// Datos del objeto "elect1"
		System.out.println("DATOS DEL ELECTRODOMÉSTICO");
		System.out.println("---------------------------------");
		System.out.println("Tipo de electrodoméstico: " + elect1.getTipoElectrodomestico()); // Tipo de electrodoméstico
		System.out.println("Color: " + elect1.getColor()); // Color
		System.out.println("Consumo eléctrico: " + elect1.getConsumoEnergetico()); // Consumo eléctrico
		System.out.println("Precio base: " + decimal.format(elect1.getPrecioBase()) + "€"); // Precio base
		System.out.println("Peso: " + decimal.format(elect1.getPeso()) + "kg"); // Peso
		System.out.println("\n//////////////////////////////////////////////////////////////////////////////////////\n");
		
		// Datos del objeto "nev1"
		System.out.println("DATOS DE LA NEVERA");
		System.out.println("---------------------------------");
		System.out.println("Tipo de electrodoméstico: " + nev1.getTipoElectrodomestico()); // Tipo de electrodoméstico
		System.out.println("Marca: " + nev1.getMarca()); // Marca
		System.out.println("Modelo: " + nev1.getModelo()); // Modelo
		System.out.println("Color: " + nev1.getColor()); // Color
		System.out.println("Consumo eléctrico: " + nev1.getConsumoEnergetico()); // Consumo eléctrico
		System.out.println("Precio base: " + decimal.format(nev1.getPrecioBase()) + "€"); // Precio base
		System.out.println("Peso: " + decimal.format(nev1.getPeso()) + "kg"); // Peso
		
		// Fin del programa
	}
}

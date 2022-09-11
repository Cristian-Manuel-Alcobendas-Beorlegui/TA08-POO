package Ejercicio3;

// NOTA: Clase creada para comprovar si funciona la herencia de clase.

// La clase "Nevera" heredará los atributos, métodos y funciones de la clase "Electrodomestico".
public class Nevera extends Electrodomestico {
	// Atributos de la clase
	private String marca, modelo;
	
	// ------------------------------------------------------------------------------------------------------------- //
	
	// Constructores (Sobrecarga)
	// Constructor por defecto
	public Nevera() {	
	}
	
	// Constructor parametrizado
	public Nevera(String tipoElectrodomestico, String marca, String modelo, String color, char consumoEnergetico, double precioBase, double peso) {
		// Dar valor a los atributos de la clase
		super(color, tipoElectrodomestico, consumoEnergetico, precioBase, peso); // Atributos de la superclase "Electrodomestico"
		this.marca = marca;
		this.modelo = modelo;
	} // Fin del constructor
	
	// ------------------------------------------------------------------------------------------------------------- //
	
	// Getters y setters
	// Atributo: Marca
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	// Atributo: Modelo
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	// ------------------------------------------------------------------------------------------------------------- //
	
	// Fin de la clase
}

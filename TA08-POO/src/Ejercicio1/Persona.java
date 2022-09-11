package Ejercicio1;

public class Persona {
	// Atributos de la clase
	// Se usa el modificador PRIVATE para hacer uso de las funciones Getter y métodos Setter.
	private String nombre, dni;
	private int edad;
	private char sexo;
	private double peso, altura;
	
	// Valor por defecto - (vpd - Valor por defecto)
	private final char vpdSexo = 'H';
	
	// ------------------------------------------------------------------------------------------------------------- //
	
	// Constructor (Sobrecarga)
	// Constructor por defecto
	public Persona() {
	}
	
	// Constructor parametrizado, menos el DNI.
	public Persona(String nombre, int edad, double peso, double altura) {
		// Dar un valor a los atributos
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = vpdSexo; // Valor por defecto
		this.peso = peso;
		this.altura = altura;
	} // Fin del constructor

	// ------------------------------------------------------------------------------------------------------------- //
	
	// Getters y setters
	// Atributo: Nombre
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	// Atributo: DNI
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	// Atributo: Edad
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	// Atributo: Sexo
	public char getSexo() {
		return sexo;
	}
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	// Atributo: Peso
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// Atributo: Altura
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	// ------------------------------------------------------------------------------------------------------------- //
	
	// Fin de la clase
}

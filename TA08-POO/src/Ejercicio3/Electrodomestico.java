package Ejercicio3;

// La clase "Electrodoméstico" será la superclase (Clase padre).
public class Electrodomestico {
	// Atributos de la clase
	// Usar el modificador PROTECTED para que los atributos solo los puedan usar la superclase y las clases que heredan de la superclase. 
	protected double precioBase, peso;
	protected String color, tipoElectrodomestico;
	protected char consumoEnergetico;
	protected String[] colores = {"Blanco", "Negro", "Rojo", "Azul", "Gris"};
	
	// Valores por defecto - (vpd - Valor por defecto)
	private final String vpdColor = "Blanco";
	private final String vpdTipoElectrodomestico = "No definido";
	private final double vpdPrecioBase = 100;
	private final char vpdConsumoEnergetico = 'F';
	private final double vpdPeso = 5;
	
	// ------------------------------------------------------------------------------------------------------------- //
	
	// Constructor (Sobrecarga)
	// Constructor por defecto
	public Electrodomestico() {
		// Asignar el valor por defecto a los atributos
		this.color = vpdColor;
		this.tipoElectrodomestico = vpdTipoElectrodomestico;
		this.consumoEnergetico = vpdConsumoEnergetico;
		this.precioBase = vpdPrecioBase;
		this.peso = vpdPeso;
	} // Fin del constructor
	
	// Constructor con los parámetros (Precio y peso)
	public Electrodomestico(double precio, double peso) {
		// Asignar un valor por defecto a los atributos a excepción de "precioBase" y "peso".
		this.color = vpdColor;
		this.tipoElectrodomestico = vpdTipoElectrodomestico;
		this.consumoEnergetico = vpdConsumoEnergetico;
		this.precioBase = precio;
		this.peso = peso;
	} // Fin del constructor 
	
	// Constructor parametrizado
	public Electrodomestico(String color, String tipoElectrodomestico, char consumoEnergetico, double precioBase, double peso) {
		// Dar valor a los atributos
		this.color = color;
		this.tipoElectrodomestico = tipoElectrodomestico;
		this.consumoEnergetico = consumoEnergetico;
		this.precioBase = precioBase;
		this.peso = peso;
		
		// Al terminar, llamar al método "comprobarColor".
		comprobarColor();
	} // Fin del constructor
	
	// ------------------------------------------------------------------------------------------------------------- //
	
	// Métodos y funciones
	// Método 1: Comprobar si el color guardado está disponible
	private void comprobarColor() {
		// Varibles
		int i;
		boolean disponible = false;
		
		// Bucle FOR para comprovar si el valor de "color" está disponible
		for(i = 0; i < colores.length && !disponible; i++) {
			// Comprovar si el color está registrado
			if(color.equalsIgnoreCase(colores[i])) {
				disponible = true;
			} // Fin IF
		} // Fin FOR
		
		// Comprovar si el color está disponible o no
		if(!disponible) {
			System.out.println("\n*****************************************************************");
			System.out.println("ERROR: El color " + this.color + " no está disponible.");
			color = vpdColor; // Cambiar el color al color por defecto.
			System.out.println("ACTUALIZACIÓN: El color cambió a " + color);
			System.out.println("*****************************************************************\n");
		} // Fin IF
	}
	
	// ------------------------------------------------------------------------------------------------------------- //
	
	// Getters y setters
	// Atributo: Color
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
		// Comprobar si el color está disponible llamando al método "comprovarColor"
		comprobarColor();
	}
	
	// Atributo: Tipo electrodoméstico
	public String getTipoElectrodomestico() {
		return tipoElectrodomestico;
	}
	
	public void setTipoElectrodomestico(String tipoElectrodomestico) {
		this.tipoElectrodomestico = tipoElectrodomestico;
	}
	
	// Atributo: Consumo Energético
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	
	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}
	
	// Atributo: Precio base
	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	
	// Atributo: Peso
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	// ------------------------------------------------------------------------------------------------------------- //
	
	// Fin de la clase
}

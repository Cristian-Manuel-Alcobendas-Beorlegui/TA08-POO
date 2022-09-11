package Ejercicio2;

public class Password {
	// Atributos
	// Usar el modificar PRIVATE para hacer uso de las funciones Getter y métodos Setter.
	private int longitud;
	private String contrasena = ""; // No añado la ñ para evitar errores con otros sistemas de caracteres
	
	// Valor por defecto - (vpd --> Valor por defecto)
	private final int vpdLongitud = 8;
	
	// ------------------------------------------------------------------------------------------------------------- //
	
	// Constructores (Sobrecarga)
	// Constructor por defecto
	public Password() {
		// Variables y atributos
		char[] caracteres = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '$', '#', '&', '@', '?', '!'};
		int numAleatorio, i; // "i" hará de contador para conseguir la longitud que se necesita para la contraseña.
		this.longitud = vpdLongitud; // Valor por defecto
		
		// Bucle FOR que generará un caracter para la contraseña mientras que la longitud no sea mas grande que 8 (Valor por defecto).
		for(i = 0; i < longitud; i++) {
			// Generar un número aleatorio
			numAleatorio = (int)(Math.random() * caracteres.length);
			
			// Añadir el caracter a la contraseña
			this.contrasena = this.contrasena + caracteres[numAleatorio];	
		} // Fin FOR
	} // Fin del constructor
	
	
	// Constructor parametrizado
	public Password(int longitud) {
		// Variables y atributos
		char[] caracteres = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '$', '#', '&', '@', '?', '!'};
		int numAleatorio, i; // "i" hará de contador para conseguir la longitud que se necesita para la contraseña.
		this.longitud = longitud;
		
		// Bucle FOR que generará un caracter para la contraseña mientras que la longitud no sea mas grande que 8 (Valor por defecto).
		for(i = 0; i < longitud; i++) {
			// Generar un número aleatorio
			numAleatorio = (int)(Math.random() * caracteres.length);
			
			// Añadir el caracter del vector a la contraseña
			this.contrasena = this.contrasena + caracteres[numAleatorio];	
		} // Fin FOR
	} // Fin del constructor
	
	// ------------------------------------------------------------------------------------------------------------- //
	
	// Getters y setters
	// Atributo: Longitud
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	
	// Atributo: Contrasena
	public String getContrasena() {
		return this.contrasena;
	}
	
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	// ------------------------------------------------------------------------------------------------------------- //

	// Fin de la clase
}


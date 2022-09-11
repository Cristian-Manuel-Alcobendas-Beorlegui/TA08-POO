package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		// 1. Crear objetos de la clase "Password"
		Password passwd = new Password();
		Password passwd2 = new Password(12);
		
		// 2. Mostrar por pantalla los datos de los objetos de la clase "Password"
		// Objeto "passwd"
		System.out.println("INFORMACIÓN DE LA CONTRASEÑA");
		System.out.println("---------------------------------------");
		System.out.println("Longitud: " + passwd.getLongitud());
		System.out.println("Contraseña: " + passwd.getContrasena());
		System.out.println("\n////////////////////////////////////////////////////////////\n");
		
		// Objeto "passwd2"
		System.out.println("INFORMACIÓN DE LA CONTRASEÑA");
		System.out.println("---------------------------------------");
		System.out.println("Longitud: " + passwd2.getLongitud());
		System.out.println("Contraseña: " + passwd2.getContrasena());
		
		// Fin del programa
	}
}

package Ejercicio4;

public class Main {

	public static void main(String[] args) {
		// 1. Crear objetos de la clase "Serie"
		Serie ser1 = new Serie();
		Serie ser2 = new Serie("Aida", "Nacho G. Velilla");
		Serie ser3 = new Serie("Transformers Prime", 4, "Acción, serie animada, ciencia ficción", "Roberto Orci, Alex Kurtzman, Duane Capizzi y Jeff Kline");
		
		// 2. Mostrar por pantalla los datos de los objetos
		// Objeto "ser1"
		System.out.println("DATOS DEL OBJETO 'ser1'");
		System.out.println("-----------------------------");
		System.out.println("Título: " + ser1.getTitulo()); // Título de la serie 
		System.out.println("Número de temporadas: " + ser1.getNumTemporadas()); // Número de temporadas
		System.out.println("Género: " + ser1.getGenero()); // Género
		System.out.println("Creador: " + ser1.getCreador()); // Creador
		System.out.println("Entregado: " + ser1.getEntregado()); // Entregado
		System.out.println("\n//////////////////////////////////////////////\n");
	
		// Objeto "ser2"
		System.out.println("DATOS DEL OBJETO 'ser2'");
		System.out.println("-----------------------------");
		System.out.println("Título: " + ser2.getTitulo()); // Título de la serie
		System.out.println("Número de temporadas: " + ser2.getNumTemporadas()); // Número de temporadas
		System.out.println("Género: " + ser2.getGenero()); // Género
		System.out.println("Creador: " + ser2.getCreador()); // Creador
		System.out.println("Entregado: " + ser2.getEntregado()); // Entregado
		System.out.println("\n//////////////////////////////////////////////\n");
	
		// Objeto "ser3"
		System.out.println("DATOS DEL OBJETO 'ser3'");
		System.out.println("-----------------------------");
		System.out.println("Título: " + ser3.getTitulo()); // Título de la serie
		System.out.println("Número de temporadas: " + ser3.getNumTemporadas()); // Número de temporadas
		System.out.println("Género: " + ser3.getGenero()); // Género
		System.out.println("Creador: " + ser3.getCreador()); // Creador
		System.out.println("Entregado: " + ser3.getEntregado()); // Entregado
		
		// Fin del programa
	}
}

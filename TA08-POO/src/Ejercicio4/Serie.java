package Ejercicio4;

public class Serie {
	// Atributos de la clase
	// Se usa el modificador PRIVATE para hacer uso de las funciones Getter y métodos Setter
	private String titulo, genero, creador;
	private int numTemporadas;
	private boolean entregado; 
	
	// Valores por defecto - (vpd --> Valor por Defecto)
	private final String vpdTitulo = "Sin especificar";
	private final int vpdNumTemporadas = 3;
	private final String vpdGenero = "Sin especificar";
	private final String vpdCreador = "Sin especificar";
	private final boolean vpdEntregado = false;
	
	
	// ------------------------------------------------------------------------------------------------------------- //
	
	// Constructor (Sobrecarga)
	// Constructor por defecto
	public Serie() {
		// Dar un valor por defecto a los atributos
		this.titulo = vpdTitulo;
		this.numTemporadas = vpdNumTemporadas;
		this.genero = vpdGenero;
		this.creador = vpdCreador;
		this.entregado = vpdEntregado;
	} // Fin del constructor
	
	// Constructor con los parámetros (Título y creador)
	public Serie(String titulo, String creador) {
		// Dar un valor a los atributos
		this.titulo = titulo;
		this.numTemporadas = vpdNumTemporadas; // Valor por defecto
		this.genero = vpdGenero; // Valor por defecto
		this.creador = creador;
		this.entregado = vpdEntregado; // Valor por defecto
	} // Fin del constructor
	
	// Constructor con todos los parámetros a excepción de "entregado".
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		// Asignar un valor a los atributos
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = vpdEntregado; // Valor por defecto
	} // Fin del constructor
	
	// ------------------------------------------------------------------------------------------------------------- //
	
	// Getters y setters
	// Atributo 1: Título
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	// Atributo 2: Número de temporadas
	public int getNumTemporadas() {
		return numTemporadas;
	}
	
	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}
	
	// Atributo 3: Genero
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	// Atributo 4: Creador
	public String getCreador() {
		return creador;
	}
	
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	// Atributo 5: Entregado
	public boolean getEntregado() {
		return entregado;
	}
	
	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}
	
	// ------------------------------------------------------------------------------------------------------------- //

	// Fin de la clase
}

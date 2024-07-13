package mx.com.cuh;

public class Producto {


	
	private int identificadorDeProducto;
	private String nombre;
	private int precio;
	private int existencias;
	
	
	
	// Constructor
	public Producto(int identificadorDeProducto, String nombre, int precio, int existencias) {
		this.identificadorDeProducto = identificadorDeProducto;
		this.nombre = nombre;
		this.precio = precio; 
		this.existencias = existencias;
	
	}
	
	//Metodos set y get

	public int getIdentificadorDeProducto() {
		return identificadorDeProducto;
	}

	public void setIdentificadorDeProducto(int identificadorDeProducto) {
		this.identificadorDeProducto = identificadorDeProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
		
		// Metodos
		
		public String mostrarNombre() {
			return this.nombre;
		
	}
	
		public int mostrarPrecio() {
			return this.existencias;
			
		}
	
		public int mostrarExistencia() {
			return this.existencias;
			
		}
}

package polimorfismo;

public class Empleado {
	protected String Nombre;
	protected double  sueldo;

	
	public Empleado(String nombre, double sueldo) {
		this.Nombre = nombre;
		this.sueldo = sueldo;
		
	}
	public String obtenerDetalles () {
		return "nombre " + this.Nombre + " Sueldo " + this.sueldo;
	}
	public String getNombre() {
		return Nombre;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	
}

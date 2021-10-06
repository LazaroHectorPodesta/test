package polimorfismo;

public class TestSobreEscritura {

	public static void main(String[] args) {
		
		Empleado empleado =  new Empleado ( "lazaro" , 100.0);
		
		imprimir (empleado);
		
		Gerente gerente = new Gerente ( "lazaro" , 100.0, "Administracion");
		
		imprimir ( gerente);
		
	}
		public static void  imprimir ( Empleado empleado) {
			
		
		System.out.println("empleado" + empleado.obtenerDetalles());
		
	}


}
package ejercicio02;

public class Oficial extends Operario {

	
	public Oficial() {

	}
	
	public Oficial(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String cadena = "";
		
		cadena+= "Empleado "+ super.getNombre() +" -> Operario -> Oficial";
		
		return cadena;
	}
}

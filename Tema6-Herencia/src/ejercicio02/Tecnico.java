package ejercicio02;

public class Tecnico extends Operario {

	public Tecnico() {

	}
	
	public Tecnico(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String cadena = "";
		
		cadena+= "Empleado "+ super.getNombre() +" -> Operario -> Tecnico";
		
		return cadena;
	}
}

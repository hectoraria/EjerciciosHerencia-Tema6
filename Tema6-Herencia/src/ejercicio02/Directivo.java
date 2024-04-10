package ejercicio02;

public class Directivo extends Empleado {

	public Directivo() {

	}
	
	public Directivo(String nombre) {
		super(nombre);
	}
	
	@Override
	public String toString() {
		String cadena = "";
		
		cadena+= "Empleado "+ super.getNombre() +" -> Directivo";
		
		return cadena;
	}
	
}

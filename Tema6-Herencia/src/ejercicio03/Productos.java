package ejercicio03;

public class Productos {

	protected String nombre;

	protected double precio;

	public Productos() {

	}

	public Productos(String nombre, double precio) {
		super();
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}

		if (precio > 0) {
			this.precio = precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	@Override
	public String toString() {
		String cad = "";
		cad += "Nombre: "+getNombre() ;
		cad += "Precio: "+getPrecio() ;
		return cad;
	}

	public double calcular(int cantidad) {

		double precioCalculado = 0;
		precioCalculado = precio * cantidad;

		return precioCalculado;

	}

}

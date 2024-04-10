package ejercicio03;

public class NoPerecedero extends Productos {

	private String tipo;

	public NoPerecedero() {

	}

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);

		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	@Override
	public String toString() {

		String cad = "";
		cad += super.toString() + " el tipo es: " + tipo;
		return cad;

	}

	@Override
	public double calcular(int cantidad) {

		double precioCalculado = super.calcular(cantidad);

		return precioCalculado;

	}
}

package ejercicio05;

public class Rectangulo extends Poligono {

	/**
	 * Atributo para el lado1
	 */
	private double lado1;
	/**
	 * Atributo para le lado2
	 */
	private double lado2;

	/**
	 * Contructor del Rectangulo con los parametros de entrada vacio (solo los heredados)
	 * 
	 * @param numeroLados Es el numero de lados
	 */
	public Rectangulo(int numeroLados) {
		super(numeroLados);
	}

	/**
	 * El Constructor del rectangulo con los parametros heredados del padre
	 * (Poligono) y con los atributos de lo lados que se necesitan
	 * 
	 * @param numeroLados Atributo heredado de Poligono que consta con la cantidad
	 *                    de lados
	 * @param lado1       Atributo del 1º lado
	 * @param lado2       Atributo del 2º lado
	 */
	public Rectangulo(int numeroLados, double lado1, double lado2) {
		super(numeroLados);
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}
	/**
	 * Get para obtener el valor del lado1
	 * @return envia lado1
	 */
	public double getLado1() {
		return lado1;
	}
	/**
	 * Set para modificar el lado1(tiene que cumplir la condicion)
	 * @param lado1
	 */
	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}
	/**
	 * Get para obtener el valor del lado2
	 * @return envia lado2
	 */
	public double getLado2() {
		return lado2;
	}
	/**
	 * Set para modificar el lado2(tiene que cumplir la condicion)
	 * @param lado2
	 */
	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}
	/**
	 * El metodo area para calcular el area de un rectangulo 
	 * multiplicando sus lados
	 * 
	 * @return area Envia el resultado del area calculada
	 */
	@Override
	public double area() {
		double area = 0;

		area = lado1 * lado2;

		return area;
	}
	/**
	 * Imprime el obejto mostrando la cantidad de lados y su valor
	 * 
	 * @return cad Envia la cadena con todo los lados y su area
	 */
	@Override
	public String toString() {
		String cad = super.toString();
		cad += "El lado 1 es: " + lado1 + "\n";
		cad += "El lado 2 es: " + lado2 + "\n";
		cad += "El area es: " + area();

		return cad;
	}
}

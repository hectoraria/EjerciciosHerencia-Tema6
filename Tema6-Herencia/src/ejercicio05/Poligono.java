package ejercicio05;

public abstract class Poligono {
	// Atributo para el numero de los lados
	protected int numeroLados;

	/**
	 * Constructor del Poligono para construir un objeto a partir del constructor padre
	 * @param numeroLados Numero de los lados que dependiendo de la cantidad de 
	 * lados que tenga es un poligono o otro
	 */
	public Poligono(int numeroLados) {
		super();

		if (numeroLados > 0) {
			this.numeroLados = numeroLados;
		}

	}
	/**
	 * Get para obtener el numero de lados
	 * @return muestra el numero de lados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}
	/**
	 * Constructor abstracto para crearlo en las clases heredadas
	 * @return enviara el area del poligono creado
	 */
	abstract double area();
	/**
	 * Imprime el obejto mostrando la cantidad de lados y su valor
	 * 
	 * @return cad Envia la cadena con el numero de lados y dependiendo del numero de lados se 
	 * imprimira una cadena difrente mostrando el tipo de poligono que es.
	 */
	@Override
	public String toString() {
		String cad = "";
		cad += "-----------------------------------------"+ "\n";
		cad += "Numero de lados: "+numeroLados + "\n";
		if (numeroLados == 2) {
			cad += "El Poligono de un Rectangulo:" + "\n";
		} else if (numeroLados == 3) {
			cad += "El Poligono es un Triangulo:" + "\n";
		}
		return cad;
	}

}

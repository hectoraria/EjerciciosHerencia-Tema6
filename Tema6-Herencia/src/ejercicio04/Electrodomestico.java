package ejercicio04;

public class Electrodomestico {

	enum Consumo {
		A, B, C, D, E, F

	}

	enum Colores {
		blanco, negro, rojo, azul, gris

	}

	protected double precio;

	protected Colores color = Colores.blanco;

	protected Consumo energia = Consumo.F;

	protected double peso = 5;

	public Electrodomestico() {

	}

	public Electrodomestico(double precio, String color, String energia, double peso) {
		super();
		if (precio > 0) {
			this.precio = precio;
		}
		this.color = Colores.valueOf(color);
		this.energia = Consumo.valueOf(energia);
		if (peso > 0) {
			this.peso = peso;
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

	public Colores getColor() {
		return color;
	}

	public void setColor(Colores color) {
		this.color = color;
	}

	public Consumo getEnergia() {
		return energia;
	}

	public void setEnergia(Consumo energia) {
		this.energia = energia;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso > 0) {
			this.peso = peso;
		}
	}
	public void comprobarConsumoEnergetico(char letra){
		
		
		
	}
}

package ejercicio03;

public class Perecedero extends Productos {
	
	private int caduca;
	public Perecedero() {

	}

	public Perecedero(String nombre, double precio, int caduca) {
		super(nombre,precio);
		
		if(caduca>0) {
			this.caduca=caduca;
		}
		
	}

	

	public int getCaduca() {
		return caduca;
	}

	public void setCaduca(int caduca) {
		if(caduca>0) {
			this.caduca=caduca;
		}
	}

	
	@Override
	public double calcular(int cantidad) {

		double precioCalculado = super.calcular(cantidad);
		
		if(this.caduca==1) {
			precioCalculado= precioCalculado/4;
		}
		if(this.caduca==2) {
			precioCalculado= precioCalculado/3;
		}
		if(this.caduca==3) {
			precioCalculado=precioCalculado/2;
		}
		

		return precioCalculado;

	}
	@Override
	public String toString() {
		String cad = super.toString();
		cad+= " -Dias a caducar: "+this.caduca;
		return cad;
	}
}

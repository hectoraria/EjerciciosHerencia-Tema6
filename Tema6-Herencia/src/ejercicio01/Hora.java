package ejercicio01;

public class Hora {

	int hora;

	int minuto;

	public Hora() {

	}

	public Hora(int hora, int minuto) {
		super();
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
	}

	public void inc() {
		this.minuto ++;

		if (minuto >= 60) {
			minuto = 0;
			hora++;
		}
	}

	public boolean setMinutos(int valor) {
		boolean funciona = false;

		if (valor >= 0 && valor <= 59) {
			this.minuto = valor;
			funciona =true;
		}

		return funciona;

	}

	public boolean setHoras(int valor) {
		boolean funciona = false;

		if (valor >= 0 && valor <= 23) {
			this.hora = valor;
			funciona =true;
		}
		return funciona;
	}

	@Override
	public String toString() {
		String cadena = "";

		cadena += this.hora + ":" + this.minuto;

		return cadena;
	}

}

package ejercicio01;

public class HoraExacta extends Hora {
	
	int segundos;
	
	public HoraExacta(int hora, int minuto,int segundos) {
		super();
		if (hora >= 0 && hora <= 23) {
			this.hora = hora;
		}
		if (minuto >= 0 && minuto <= 59) {
			this.minuto = minuto;
		}
		if(segundos >=0 && segundos <=59) {
			this.segundos = segundos;
		}
	}
	
	public boolean setSegundos(int valor) {
		boolean funciona=false;
		
		if(valor>=0 && valor <=59) {
			this.segundos = valor;
		}
		
		return funciona;
		
	}
	public void inc() {
		this.segundos += 1;

		if (segundos >= 60) {
			segundos = 0;
			minuto++;
		}
	}
	
	public String toString() {
		String cadena = "";

		cadena += super.toString()+this.segundos;

		return cadena;
	}
}

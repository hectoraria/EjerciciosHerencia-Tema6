package ejercicio01;

import java.util.Scanner;

public class main {
	// Importo al escaner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Variable de la opcion del menu
		int opc = 0;
		// Importo al escaner
		Scanner sc = new Scanner(System.in);
		// Llamo al menu
		menu();
		// Recogo la opcion
		opc = sc.nextInt();
		sc.nextLine();

		switch (opc) {
		case 1 -> {
			
			Hora();
		}
		case 2 -> {
			HoraExacta();
		}
		default -> {
			System.out.println("Saliendo....");
			break;
		}
		}
	}

	public static void menu() {

		System.out.println("Selecciona una de estas opciones:");
		System.out.println("------------------------------------");
		System.out.println("1. Crea una Hora");
		System.out.println("2. Crea una HoraExacta");
		System.out.println("3. Salir");
	}

	public static void menuHora() {
		System.out.println("Selecciona una de estas opciones:");
		System.out.println("------------------------------------");
		System.out.println("1. Incrementa los minutos");
		System.out.println("2. Modifica los minutos");
		System.out.println("3. Modifica la hora");
		System.out.println("4. Imprimir la hora");
		System.out.println("5. Salir");
	}

	public static void menuHoraExacta() {
		System.out.println("Selecciona una de estas opciones:");
		System.out.println("------------------------------------");
		System.out.println("1. Incrementa los segundos");
		System.out.println("2. Modifica los segundos");
		System.out.println("3. Imprimir la hora");
		System.out.println("4. Salir");
	}

	public static void Hora() {
		
		// Creo la clase hora
		Hora hora;
	
		// Variable para la cantidad de minutos y horas que quiere cambiar;
		int mins;
		int hors;
		int opc=0;
		// Variables para crear el objeto hora
		System.out.println("Introduce la hora:");
		int horas = sc.nextInt();
		sc.nextLine();
		System.out.println("Introduce los minutos:");
		int minutos = sc.nextInt();
		sc.nextLine();
		hora = new Hora(horas, minutos);
		do {
			
		
		menuHora();
		// Variable de la opcion

		opc = sc.nextInt();
		sc.nextLine();

		

		switch (opc) {
		case 1 -> {
			hora.inc();
			break;
		}
		case 2 -> {
			System.out.println("Cuantos minutos quieres cambiar");
			mins = sc.nextInt();
			sc.nextLine();
			if (hora.setMinutos(minutos)) {
				System.out.println("Se ha cambiado correctamente");
			} else {
				System.out.println("No se ha cambiado correctamente");
			}
			break;
		}
		case 3 -> {
			System.out.println("Cuantas horas quieres cambiar");
			hors = sc.nextInt();
			sc.nextLine();
			if (hora.setMinutos(hors)) {
				System.out.println("Se ha cambiado correctamente");
			} else {
				System.out.println("No se ha cambiado correctamente");
			}
			break;
		}
		case 4->{
			System.out.println(hora);
			break;
		}
		case 5->{
			System.out.println("Saliendo.....");
			break;
		}

		}
		}while(opc!=5);

	}
	public static void HoraExacta() {
		// Creo la clase hora
				HoraExacta hora;
			
				// Variable para la cantidad de minutos y horas que quiere cambiar;
				int mins;
				int hors;
				int opc=0;
				// Variables para crear el objeto hora
				System.out.println("Introduce la hora:");
				int horas = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce los minutos:");
				int minutos = sc.nextInt();
				sc.nextLine();
				System.out.println("Introduce los segundos:");
				int segundos = sc.nextInt();
				sc.nextLine();
				hora = new HoraExacta(horas, minutos,segundos);
				do {
					
				
				menuHoraExacta();
				// Variable de la opcion

				opc = sc.nextInt();
				sc.nextLine();

				

				switch (opc) {
				case 1 -> {
					hora.inc();
					break;
				}
				case 2 -> {
					System.out.println("Cuantos segundos quieres cambiar");
					mins = sc.nextInt();
					sc.nextLine();
					if (hora.setSegundos(segundos)) {
						System.out.println("Se ha cambiado correctamente");
					} else {
						System.out.println("No se ha cambiado correctamente");
					}
					break;
				}
				case 3 -> {
					System.out.println(hora);
					break;
				
				}
				case 4->{
					System.out.println("Saliendo.....");
					break;
				}
				

				}
				}while(opc!=4);

	}
}

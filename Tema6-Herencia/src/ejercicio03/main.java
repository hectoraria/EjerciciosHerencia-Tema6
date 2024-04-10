package ejercicio03;

public class main {

	public static void main(String[] args) {
		Productos p =new Productos("Marco",2);
		Perecedero pere =new Perecedero("Edu",12,3);
		NoPerecedero nop=new NoPerecedero("Lorenzo",3,"persona");
		
		System.out.println(p);
		System.out.println(pere);
		System.out.println(pere.calcular(1));
		System.out.println(nop);

	}

}

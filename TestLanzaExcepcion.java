package listadoExcepcionesSanchezSantacruzAntonioJesus;

/**
 * 8. Analiza la siguiente clase TestLanzaExcepcion. En el metodo2() se lanza
 * una excepci�n NullPointerException en la l�nea nula.toString();
 * 
 * @author Antonio Jes�s S�nchez Santacruz
 * @version 1.0
 *
 */
public class TestLanzaExcepcion {
	public static void main(String[] args) {
		metodo1();
		System.out.println("main: Acabando...");
	}

	private static void metodo1() {
		metodo2();
		System.out.println("M�todo1: Acabando...");
	}

	private static void metodo2() {
		String nula = null;
		nula.toString();
		System.out.println("M�todo2: Acabando...");
	}
}

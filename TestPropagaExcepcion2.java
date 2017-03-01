package listadoExcepcionesSanchezSantacruzAntonioJesus;

/**
 * 9. Ejecuta el siguiente código y responde:
 * 
 * @author Antonio Jesús Sánchez Santacruz
 * @version 1.0
 *
 */
public class TestPropagaExcepcion2 {

	public static void main(String[] args) {
		metodo1();
	}

	private static void metodo1() {
		metodo2();
	}

	private static void metodo2() {
		metodo3();
	}

	private static void metodo3() {
		try {
			int a = 7 / 0;
		} catch (Exception e) {
			System.err.println("División por cero.");
		}
	}
}

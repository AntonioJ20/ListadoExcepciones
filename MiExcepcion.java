package listadoExcepcionesSanchezSantacruzAntonioJesus;

/**
 * 8. Analiza la siguiente clase TestLanzaExcepcion. En el metodo2() se lanza
 * una excepci�n NullPointerException en la l�nea nula.toString();
 * 
 * @author Antonio Jes�s S�nchez Santacruz
 * @version 1.0
 *
 */
public class MiExcepcion extends Exception {
	public MiExcepcion(String message) {
		super(message);
	}
}

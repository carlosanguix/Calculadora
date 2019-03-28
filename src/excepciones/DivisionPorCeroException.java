package excepciones;

public class DivisionPorCeroException extends Exception {

	public static String mensaje() {
		
		return "La división por cero no está permitida";
	}
	
}

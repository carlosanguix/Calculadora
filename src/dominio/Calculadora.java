package dominio;

public class Calculadora {

	// ATRIBUTOS
	private double numero1;
	private double numero2;

	private String operacion;
	private String numActual;
	private String numMemoria;


	// CONSTRUCTOR
	public Calculadora() {


	}


	// GETTERS / SETTERS
	public double getNumero1() {
		return numero1;
	}
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	public double getNumero2() {
		return numero2;
	}
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public String getNumActual() {
		return numActual;
	}
	public void setNumActual(String numActual) {
		this.numActual = numActual;
	}
	public String getNumMemoria() {
		return numMemoria;
	}
	public void setNumMemoria(String numMemoria) {
		this.numMemoria = numMemoria;
	}


	// METODOS
	// Operaciones aritméticas
	public double sumar() {

	}

	public double restar() {

	}

	public double multiplicar() {

	}

	public double dividir() throws DivisionPorCeroException {

	}

	public void porcentaje() {

	}

	public double raiz() {

	}

	public double inversa() throws DivisionPorCeroException {

	}

	// Cambiar signo al valor actual
	public void cambiarSigno() {

	}

	// Resetear todas las variables
	public void reset() {

	}

	// Concatenar número al numActual
	public String concatenar(String numero) {

	}
	
	// ¿BackSpace?
	public void retroceder() {

	}

	public void sumarMemoria() {

	}

	public void restarMemoria() {


	}

	// Calcular cualquier operación
	public double calcular() throws DivisionPorCeroExcepcion {

		double res = 0;
		switch (operacion){
		case "+": res = sumar(); break;
		case "-": res = restar(); break;
		case "*": res = multiplicar(); break;
		case "/": res = dividir(); break;
		case "+%": porcentaje(); res = sumar(); break;
		case "-%": porcentaje(); res = restar(); break;
		case "*%": porcentaje(); res = num2; break;
		case "/%": porcentaje(); res = dividir(); break;
		}
		return res;
	}












}

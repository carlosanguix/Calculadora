package dominio;

import excepciones.DivisionPorCeroException;

public class Calculadora {

	// ATRIBUTOS
	private double numero1;
	private double numero2;

	private String operacion;
	private String numActual;
	private String numMemoria;


	// CONSTRUCTOR
	public Calculadora() {
		this.numero1 = this.numero2 = 0;
		this.operacion = this.numActual = this.numMemoria = "";
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
		double suma = this.numero1 + this.numero2;
		this.numero1 = suma;
		return suma;
	}

	public double restar() {
		return 0;
	}

	public double multiplicar() {
		return 0;
	}

	public double dividir() throws DivisionPorCeroException {
		double resultado = 0;
		if (this.getNumero2() == 0) {
			throw new DivisionPorCeroException();
		} else {
			resultado =  this.numero1 / this.numero2;
		}
		return resultado;
	}

	public void porcentaje() {

	}

	public double raiz() {
		return 0;
	}

	public double inversa() throws DivisionPorCeroException {
		return 0;
	}

	// Cambiar signo al valor actual
	public void cambiarSigno() {

	}

	// Resetear todas las variables
	public void reset() {

	}

	// Concatenar número al numActual
	public String concatenar(String numero) {
		if (this.numActual == "" || this.numActual.equals("0")) {
			this.numActual = numero;
		} else {
			this.numActual+=numero;
		}
		return this.numActual;
	}

	// ¿BackSpace?
	public void retroceder() {
		if (this.numActual.length() > 0) {
			this.numActual = this.numActual.substring(0, this.numActual.length() - 1);
		}
		if (this.numActual.equals("")) {
			this.numActual = "0";
		}
	}

	public void sumarMemoria() {

	}

	public void restarMemoria() {


	}

	// Calcular cualquier operación
	public double calcular() throws DivisionPorCeroException {

		double res = 0;
		switch (this.operacion){
		case "+": res = sumar(); break;
		case "-": res = restar(); break;
		case "*": res = multiplicar(); break;
		case "/": res = dividir(); break;
		case "+%": porcentaje(); res = sumar(); break;
		case "-%": porcentaje(); res = restar(); break;
		case "*%": porcentaje(); res = numero2; break;
		case "/%": porcentaje(); res = dividir(); break;
		}
		this.numActual = Double.toString(res);
		return res;

	}












}

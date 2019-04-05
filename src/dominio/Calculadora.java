package dominio;

import excepciones.DivisionPorCeroException;
import excepciones.RaizNumeroNegativoException;

public class Calculadora {

	// ATRIBUTOS
	private double numero1;
	private double numero2;

	private String operacion;
	private String numActual;
	private String numMemoria;


	// CONSTRUCTOR
	public Calculadora() {
		this.numero1 = 0;
		this.numero2 = 0;
		this.operacion = this.numMemoria = ""; 
		this.numActual = "0";
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

		double resultado;

		if (this.operacion.contains("%")) {

			resultado = this.numero1 + (this.numero1 * (this.numero1 / 100));

		} else {

			resultado = this.numero1 + this.numero2;
		}

		return resultado;
	}

	public double restar() {

		double resultado;

		if (this.operacion.contains("%")) {

			resultado = this.numero1 - (this.numero1 * (this.numero1 / 100));

		} else {

			resultado = this.numero1 - this.numero2;
		}

		return resultado;
	}

	public double multiplicar() {

		double resultado;

		if (this.operacion.contains("%")) {

			resultado = this.numero1 * (this.numero1 * (this.numero1 / 100));

		} else {

			resultado = this.numero1 * this.numero2;
		}

		return resultado;
	}

	public double dividir() throws DivisionPorCeroException {

		double resultado = 0;

		if (this.getNumero2() == 0) {
			reset();
			throw new DivisionPorCeroException();
		}

		if (this.operacion.contains("%")) {

			resultado = this.numero1 / (this.numero1 * (this.numero1 / 100));

		} else {

			resultado = this.numero1 / this.numero2;
		}

		return resultado;
	}

	public void porcentaje() {

		//TODO Tratar las operaciones con porcentajes aquí, o no...

	}

	public double raiz(double numero) throws RaizNumeroNegativoException {

		if (numero < 0) {
			reset();
			throw new RaizNumeroNegativoException();
		}
		return Math.sqrt(numero);

	}

	public double inversa(double numero) throws DivisionPorCeroException {

		return 1 / numero;
	}

	public void cambiarSigno() {

		if (this.numActual.charAt(0) == '-') {
			this.numActual = this.numActual.substring(1, this.numActual.length());
		} else {
			this.numActual = '-' + this.numActual;
		}
	}

	public void reset() {
		this.numero1 = 0;
		this.numero2 = 0;
		this.operacion = "";
		this.numActual = "0";
	}

	public String concatenar(String numero) {

		if (this.numActual.equals("") || this.numActual.equals("0")) {
			if (numero.equals(".")) {
				this.numActual = "0.";
			} else {
				this.numActual = numero;
			}
		} else {
			if (numero.equals(".") && !this.numActual.contains(".")) {
				this.numActual += numero;
			} else if (!numero.equals(".")) {
				this.numActual += numero;
			}
		}
		return this.numActual;

	}

	public void retroceder() {
		// TODO Optimizar
		if (this.numActual.length() > 0) {
			if (this.numActual.length() == 2 && this.numActual.charAt(0) == '-') {
				this.numActual = "0";
			} else {
				this.numActual = this.numActual.substring(0, this.numActual.length() - 1);
			}
		}
		if (this.numActual.equals("")) {
			this.numActual = "0";
		}
	}

	public void sumarMemoria() {

		double numero1 = Double.parseDouble(this.numMemoria);
		double numero2 = Double.parseDouble(this.numActual);

		numero1 = numero1 + numero2;

		this.numMemoria = Double.toString(numero1);

	}

	public void restarMemoria() {

		double numero1 = Double.parseDouble(this.numMemoria);
		double numero2 = Double.parseDouble(this.numActual);

		numero1 = numero1 - numero2;

		this.numMemoria = Double.toString(numero1);

	}

	public double calcular() throws DivisionPorCeroException {

		double res = 0;
		switch (this.operacion){
		case "+": res = sumar(); break;
		case "-": res = restar(); break;
		case "*": res = multiplicar(); break;
		case "/": res = dividir(); break;
		// TODO porque? porcentaje
		case "+%": porcentaje(); res = sumar(); break;
		case "-%": porcentaje(); res = restar(); break;
		case "*%": porcentaje(); res = multiplicar(); break;
		case "/%": porcentaje(); res = dividir(); break;
		}

		this.numActual = Double.toString(res);
		return res;

	}












}

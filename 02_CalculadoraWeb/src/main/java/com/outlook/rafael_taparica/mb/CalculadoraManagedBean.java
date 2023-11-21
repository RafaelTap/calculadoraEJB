package com.outlook.rafael_taparica.mb;

import jakarta.annotation.ManagedBean;
import jakarta.ejb.EJB;

@ManagedBean
public class CalculadoraManagedBean {

	// local do EJB via JNDI (java naming directory interface)

	@EJB(lookup = "ejb/02_calculadora/com.outlook.rafael_taparica.interfaces.CalculadoraLocal")
	private CalculadoraLocal calc;

	private double x, y;

	private String resultado;

	private double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setX(double x) {
		this.x = x;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public void somar() {
		double result = calc.somar(x, y);
		resultado = "Soma = " + result;
	}

	public void subtrair() {
		double result = calc.subtrair(x, y);
		resultado = "Subtração = " + result;
	}

	public void multiplicar() {
		double result = calc.multiplicar(x, y);
		resultado = "Multiplicação = " + result;
	}

	public void dividir() {
		double result = calc.dividir(x, y);
		resultado = "divisão = " + result;
	}

}

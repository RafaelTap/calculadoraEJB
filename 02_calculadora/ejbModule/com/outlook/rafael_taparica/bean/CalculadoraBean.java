package com.outlook.rafael_taparica.bean;

import com.outlook.rafael_taparica.interfaces.CalculadoraLocal;

import jakarta.ejb.Stateless;

@Stateless
public class CalculadoraBean implements CalculadoraLocal {

	@Override
	public double somar(double x, double y) {
		return x + y;
	}

	@Override
	public double subtrair(double x, double y) {
		return x - y;
	}

	@Override
	public double multiplica(double x, double y) {
		return x * y;
	}

	@Override
	public double dividir(double x, double y) {
		return x / y;
	}

}

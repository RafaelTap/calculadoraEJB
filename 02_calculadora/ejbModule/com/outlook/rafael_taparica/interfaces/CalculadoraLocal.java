package com.outlook.rafael_taparica.interfaces;

import jakarta.ejb.Local;

@Local
public interface CalculadoraLocal {

	double somar(double x, double y);

	double subtrair(double x, double y);

	double multiplica(double x, double y);

	double dividir(double x, double y);

}

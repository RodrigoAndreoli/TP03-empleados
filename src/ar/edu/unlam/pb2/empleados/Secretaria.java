package ar.edu.unlam.pb2.empleados;

import java.sql.Date;

public class Secretaria extends Empleado implements ServicioImpuesto {
	private final Double TOPE = 8000.00;

	public Secretaria(String nombre, Double salario, Date fecha) {
		super(nombre, salario, fecha);
	}

	public Double calcularImpuesto() {
		Double sueldo = this.getSalario();
		if (sueldo > TOPE) {
			sueldo -= TOPE;
			sueldo *= IMPUESTO;
		} else {
			sueldo = 0.00;
		}
		return sueldo;
	}

}
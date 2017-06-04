package ar.edu.unlam.pb2.empleados;

import java.sql.Date;

public class Gerente extends Empleado implements ServicioImpuesto {
	private Integer cochera;
	private final Double TOPE = 15000.00;

	public Gerente(String nombre, Double salario, Date fecha, Integer cochera) {
		super(nombre, salario, fecha);
		this.cochera = cochera;
	}

	public Integer getCochera() {
		return cochera;
	}

	public void setCochera(Integer cochera) {
		this.cochera = cochera;
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
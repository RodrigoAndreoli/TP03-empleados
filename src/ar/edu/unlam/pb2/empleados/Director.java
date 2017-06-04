package ar.edu.unlam.pb2.empleados;

import java.sql.Date;

public class Director extends Empleado implements ServicioImpuesto {
	private Integer cochera;
	protected Double gastosExtra;
	private final Double TOPE = 20000.00;

	public Director(String nombre, Double salario, Date fecha, Integer cochera) {
		super(nombre, salario, fecha);
		this.setCochera(cochera);
	}

	public Double getGastosExtra() {
		return gastosExtra;
	}

	public void setGastosExtra(Double gastosExtra) {
		this.gastosExtra = gastosExtra;
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
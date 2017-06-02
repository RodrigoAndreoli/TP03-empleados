package ar.edu.unlam.pb2.empleados;

import java.sql.Date;

public class Director extends Gerente {
	protected Double gastosExtra;
	public Director (String nombre, Double salario, Date fecha, Integer cochera){
		super(nombre, salario, fecha, cochera);
	}
	
	public Double getGastosExtra() {
		return gastosExtra;
	}
	public void setGastosExtra(Double gastosExtra) {
		this.gastosExtra = gastosExtra;
	}
	
}

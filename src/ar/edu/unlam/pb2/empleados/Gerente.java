package ar.edu.unlam.pb2.empleados;

import java.sql.Date;

public class Gerente extends Empleado {
	private Integer cochera;
	
	public Gerente (String nombre, Double salario, Date fecha, Integer cochera){
		super(nombre, salario, fecha);
		this.cochera = cochera;
	}

	public Integer getCochera() {
		return cochera;
	}

	public void setCochera(Integer cochera) {
		this.cochera = cochera;
	}	
}

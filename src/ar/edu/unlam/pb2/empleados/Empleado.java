package ar.edu.unlam.pb2.empleados;

import java.sql.Date;

public class Empleado {
	protected String nombre;
	protected Double salario;
	protected Date fechaCumpleaños;
	protected String brindarDetalles;

	public Empleado (String nombre, Double salario, Date fecha){
		this.nombre = nombre;
		this.salario = salario;
		this.fechaCumpleaños = fecha;
		this.brindarDetalles = "Empleado nuevo";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getFechaCumpleaños() {
		return fechaCumpleaños;
	}

	public void setFechaCumpleaños(Date fechaCumpleaños) {
		this.fechaCumpleaños = fechaCumpleaños;
	}

	public String getBrindarDetalles() {
		return brindarDetalles;
	}

	public void setBrindarDetalles(String brindarDetalles) {
		this.brindarDetalles = brindarDetalles;
	}
}
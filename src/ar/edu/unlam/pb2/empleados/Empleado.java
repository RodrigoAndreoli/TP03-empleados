package ar.edu.unlam.pb2.empleados;

import java.sql.Date;

public abstract class Empleado {
	protected String nombre;
	protected Double salario;
	protected Date fechaNacimiento;
	protected String brindarDetalles;
	protected final Double IMPUESTO = 0.175;

	public Empleado(String nombre, Double salario, Date fecha) {
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = fecha;
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

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getBrindarDetalles() {
		return brindarDetalles;
	}

	public void setBrindarDetalles(String brindarDetalles) {
		this.brindarDetalles = brindarDetalles;
	}

}
package paqueteLectura;

import paqueteLectura.Lectura;


public class Estadio {

	private double capacidad;

	private String  nombreEstadio;

	protected Lectura lee;

	

	public Estadio() {

		System.out.println("Se crea estadio");

		lee=new Lectura();

	}

	

	public Estadio(double capacidad,String nombreEstadio) {

		this.capacidad=capacidad;

		this.nombreEstadio=nombreEstadio;

	}

	

	public void setCapacidad(double capacidad) {

		this.capacidad=capacidad;

	}

	

	public void setNombreEstadio(String nombreEstadio) {

		this.nombreEstadio=nombreEstadio;

	}

	

	public double getCapacidad() {

		return capacidad;

	}

	

	public String getNombreEstadio() {

		return nombreEstadio;

	}

	

	public void leerDatos() {

		System.out.println("Ingresa la capacidad:");

		this.capacidad=this.lee.nextDouble();


		System.out.println("Ingresa el nombre del estadio:");

		this.nombreEstadio=this.lee.nextLine();

	}

	

}
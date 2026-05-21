package paqueteLectura;

import paqueteLectura.Lectura;

public abstract class Persona implements SerVivo {

	private String nombre;
	private String direccion;
	protected Lectura lee;
	private Fecha fechaNacimiento;





	public Persona() {

		System.out.println("Se crea objeto persona");
		lee=new Lectura();
        fechaNacimiento=new Fecha();
	}

	public Persona(String nombre,String direccion,Fecha fechaNacimiento) {

        lee =new Lectura();
		this.nombre=nombre;
		this.direccion=direccion;
		this.fechaNacimiento=fechaNacimiento;
	}


	public Persona(String nombre,String direccion,byte dia,byte mes,short anho) {

		System.out.println("Se crea objeto persona");
        lee =new Lectura();
		fechaNacimiento =new Fecha(dia,mes,anho);
		this.nombre=nombre;
		this.direccion=direccion;

	}

	public void setNombre(String nombre) {

		this.nombre=nombre;

	}

	public String getNombre() {

		return this.nombre;

	}

	public void setDireccion(String direccion) {

		this.direccion=direccion;

	}


    public String getDireccion() {

		return this.direccion;

	}

	public void caminar() {

		System.out.println("Caminando");

	}

    public void correr() {

		System.out.println("corriendo");

	}

	public void hablarPorTelefono() {

		System.out.println("Hablando por telefono");

	}

	public void leerDatos() {

		System.out.println("Ingresa el nombre:");
		this.nombre=this.lee.nextLine();

		System.out.println("Ingresa la direccion cabrona");
		this.direccion=this.lee.nextLine();

		System.out.println("Ingresa tu dia de nacimiento ");
		fechaNacimiento.setDia(this.lee.nextByte());

		System.out.println("Ingresa tu mes de nacimiento");
		fechaNacimiento.setMes(this.lee.nextByte());

		System.out.println("Ingresa tu año de nacimiento");
		fechaNacimiento.setAnho(this.lee.nextShort());

	}

	public String toString() {

		return "Nombre "+ this.nombre+
                "\nDireccion: "+this.direccion+
                "\nFecha de nacimiento: "+
                fechaNacimiento.getDia()+"\n"+
                fechaNacimiento.getMes()+"\n"+
                fechaNacimiento.getAnho();
    }

	public void mostrarEstadistica() {
        System.out.println("Sin datos");
	}

	public void cerrarFlujop() {

		this.lee.close();

	}

}

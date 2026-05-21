package paqueteLectura;

public abstract class Futbolista extends Persona {

	private int numero;
	private String equipo;
    private String nacionalidad;
	protected Lectura lee;
	private Fecha fechaNacimiento;

	
	public Futbolista() {

		System.out.println("Se crea futbolista");

	}



	public Futbolista(String nombre,String direccion,Fecha fechaNacimiento, int numero,String equipo,String nacionalidad) {
	    super(nombre,direccion,fechaNacimiento);
		this.numero=numero;
		this.equipo=equipo;
		this.nacionalidad=nacionalidad;

	}

	public Futbolista(String nombre,String direccion,byte dia,byte mes,short anho,int numero,String equipo,String nacionalidad) {

		super(nombre,direccion,dia,mes,anho);
		this.numero=numero;
		this.equipo=equipo;
		this.nacionalidad=nacionalidad;

	}

	

}

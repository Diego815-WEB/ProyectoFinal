package paqueteLectura;

public abstract class Futbolista extends Persona implements Acciones{

	private int numero;

	private String equipo;

	private String nacionalidad;

	protected Lectura lee;

	private Fecha fechaNacimiento;

	

	public Futbolista() {

		System.out.println("Se crea futbolista");

		lee=new Lectura();

        fechaNacimiento=new Fecha();

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

	

	public void setNumero(int numero) {

		this.numero=numero;

	}

	

	public void setEquipo(String equipo) {

		this.equipo=equipo;

	}

	

	public void setNacionalidad(String nacionalidad) {

		this.nacionalidad=nacionalidad;

	}

	

	public int getNumero() {

		return numero;

	}

	

	public String getEquipo() {

		return equipo;

	}

	

	public String getNacionalidad() {

		return nacionalidad;

	}

	

	public void leerDatos() {

		super.leerDatos();

		System.out.println("Ingresa el numero:");

		this.numero=this.lee.nextInt();


		System.out.println("Ingresa el Equipo ojitos");

		this.equipo=this.lee.nextLine();


		System.out.println("Ingresa la nacionalidad perra puta");

		this.nacionalidad=this.lee.nextLine();

	}

	

	

	public String toString() {

		return super.toString()+"\nNumero: "+this.numero+"\nEquipo: "+this.equipo+

				"\nNacionalidad: "+this.nacionalidad;

		

	}

	

	public  void mostrarEstadistica() {

		System.out.println("Estadistica");

		System.out.println("\nNumero: "+this.numero);

		System.out.println("\nEquipo: "+this.equipo);

		System.out.println("\nNacionalidad: "+this.nacionalidad);

	}

	

	 public abstract void jugadaEspecial1();

	 

	 public abstract void jugadaEspecial2();

		

	 public abstract void cambio();

	

	

	

	

	

	

	


}

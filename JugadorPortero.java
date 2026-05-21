package paqueteLectura;
public abstract class JugadorPortero extends Futbolista {
	private float estatura;
	private double golesRecibidos;
	protected Lectura lee;
	private Fecha fechaNacimiento;

	public JugadorPortero() {
		System.out.println("Se crea portero");
		lee=new Lectura();
		fechaNacimiento=new Fecha();
	}
	public JugadorPortero(String nombre,String direccion,Fecha fechaNacimiento, int numero,String equipo,String nacionalidad,float estatura,double golesRecibidos) {
		super(nombre,direccion,fechaNacimiento,numero,equipo,nacionalidad);
		this.estatura=estatura;
		this.golesRecibidos=golesRecibidos;
	}

	public JugadorPortero(String nombre,String direccion,byte dia,byte mes,short anho,int numero,String equipo,String nacionalidad, float estatura,double golesRecibidos) {
		super(nombre,direccion,dia,mes,anho,numero,equipo,nacionalidad);
		this.estatura=estatura;
		this.golesRecibidos=golesRecibidos;
	}

	public void setEstatura(float estatura) {
		this.estatura=estatura;
	}

	public void setGolesRecibidos(double golesRecibidos) {
		this.golesRecibidos=golesRecibidos;
	}

	public float getEstura() {
		return estatura;
	}

	public double getGolesRecibidos() {
		return golesRecibidos;
	}


	public void leerDatos() {
		super.leerDatos();
		System.out.println("Ingresa la estatura:");
		this.estatura=this.lee.nextFloat();

		System.out.println("Ingresa los goles que ha recibido");
		this.golesRecibidos=this.lee.nextDouble();
	}

	public void jugadaEspecial1() {
		System.out.println("Atajada a una mano");
	}

	public  void jugadaEspecial2() {
		System.out.println("Despeje potente");
	}

	public void cambio() {
		System.out.println("Se cambio de portero");
	}

	public void Atajada() {
		System.out.println("El portero se avienta para evitar el gol");
	}

	public void RematarAporteria() {
		System.out.println("remate de cabeza a porteria contraria");
	}

	public String toString() {
		return super.toString()+"\nEstatura: "+this.estatura+"\nGoles recibidos: "+this.golesRecibidos;
	}

	public  void mostrarEstadistica() {
		System.out.println("Estadistica");
		System.out.println("\nEstatura: "+this.estatura);
		System.out.println("\nGoles Recibidos: "+this.golesRecibidos);
	}



}
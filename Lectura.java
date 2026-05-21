package paqueteLectura;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Lectura {

    private InputStreamReader n;
    private BufferedReader cosa;
	private String renglon;
	private double realGrande;
	private float real;
	private int entero;
	private short enteroMedio;
	private byte enteroPeque;
	private String cadena;

	public Lectura() {
        this.n= new InputStreamReader(System.in);
	    this.cosa= new BufferedReader(n);
    }

	public String leerRenglon() {
        try {
        this.renglon= this.cosa.readLine();
        }

		catch(IOException lee) {
            System.out.println("\nFalla: No se pudo leer del teclado " +
            lee.getMessage());
        }
        return this.renglon;

	}

    public void convierte(String tipo) {

	    boolean repite= true;
        leerRenglon();
        while(repite)
        {

			try{

				switch(tipo) {

					case "double":
						this.realGrande= Double.parseDouble(this.renglon);
						repite= false;
						break;
					case "float":

						this.real= Float.parseFloat(this.renglon);
                        repite= false;
						break;	

					case "int":
						this.entero= Integer.parseInt(this.renglon);
						repite= false;
						break;

					case "short":
						this.enteroMedio= Short.parseShort(this.renglon);
						repite= false;
						break;

					case "byte":
						this.enteroPeque= Byte.parseByte(this.renglon);
						repite= false;
						break;
					case "String":
						this.cadena= renglon;
						repite= false;
						break;
					default:
						this.leerRenglon();
						break;

				}

			}

			catch(NumberFormatException convierte) {
				System.out.print("\nFalla: No se pudo convertir, " +
					convierte.getMessage() +
					"\nVuelve a ingresar el dato:  ");
    				this.leerRenglon();
    		}
		}
	}

	

	public double nextDouble() {

		this.convierte("double");
		return this.realGrande;
	}

	

	public float nextFloat() {
		this.convierte("float");
		return this.real;
	}

	

	public int nextInt() {
		this.convierte("int");
		return this.entero;
	}

	

	public short nextShort() {
		this.convierte("short");
		return this.enteroMedio;
	}

	

	public byte nextByte() {
		this.convierte("byte");
		return this.enteroPeque;
	}

	

	public String nextLine() {
		this.convierte("String");
		return this.cadena;
	}

	

	public void close() {

		try {
       		if(this.cosa != null)
       			this.cosa.close();
    	} 

    	catch(IOException ec) {

    		System.out.println(":( No pude cerrar el flujo: " + ec );

    	}

	}

}

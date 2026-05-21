package paqueteLectura;
public class Fecha {


	private byte dia;
	private byte mes;
	private short anho;

	public Fecha() {
		System.out.println("Se crea objeto de Fecha");
	}

	public Fecha(byte dia, byte mes, short anho) {

		this.dia= dia;
		this.mes= mes;
		this.anho= anho;
	}


	public byte getDia() {
		return dia;
	}


	public void setDia(byte dia) {
		this.dia = dia;
	}


	public byte getMes() {
		return mes;
	}


	public void setMes(byte mes) {
		this.mes = mes;
	}


	public short getAnho() {
		return anho;
	}


	public void setAnho(short anho) {
		this.anho = anho;
	}

}

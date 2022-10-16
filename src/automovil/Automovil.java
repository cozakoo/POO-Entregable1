package automovil;

public class Automovil {
	
	//TODO [CORRECCION] Como buena práctica, definir cada atributo en un reglon
	private String marca,modelo,patente,color;
	private int anio,velocidadMaxima;
	
	public Automovil(String patente, String color, int velocidadMaxima) {
		this.patente = patente;
		this.color = color;
		this.velocidadMaxima = velocidadMaxima;		
	}
	
	
	public Automovil(String marca, String modelo, int anio, String patente, String color, int velocidadMaxima) {
		this(patente,color,velocidadMaxima);
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}
	
	


	public Automovil() {
		// TODO Auto-generated constructor stub
	}


	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}



	@Override
	public String toString() {
		return String.format("%s %s - %s", this.marca, this.modelo, this.patente);
	}
	
	
	public String arrancar() {
		return String.format("encendiendo el %s", this.toString());
	}
	
	public String avanzar(int velocidad) {
		return String.format("El %s esta acelerando a %d Km", this.toString(), velocidad);
	}
	
	public String frenar() {
		return String.format("El %s esta frenando", this.toString());
	}
	
	
	
	
	
	
	
	
}

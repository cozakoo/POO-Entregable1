//TODO [CORRECCION] Se coordino en clase que los proyectos se debian entregar en Java 11, no es 14. Este ya lo converti a Java 11.
package automovil;

public class Prueba {

	public static void main(String[] args) {
		
		Automovil a1 = new Automovil("Peugoet", "208", 2016, "ACD 123 DE", "Rojo", 240);
		Automovil a2 = new Automovil("Kia", "Sorento", 2019, "GG 4673 HT", "Negro", 270);
		
		Automovil a3 = new Automovil();
		a3.setMarca("Volkwagen");
		a3.setModelo("Polo");
		a3.setAnio(2003);
		a3.setPatente("DGS 343 WTS");
		a3.setColor("Amarillo");
		a3.setVelocidadMaxima(230);
		
		
		
		System.out.println(a1.arrancar());
		System.out.println(a2.arrancar());
		System.out.println(a3.arrancar() + "\n");
		
		System.out.println(a1.avanzar(40));
		System.out.println(a2.avanzar(120));
		System.out.println(a3.avanzar(60)+ "\n");
		
		System.out.println(a1.frenar());
		System.out.println(a2.frenar());
		System.out.println(a3.frenar()+ "\n");
		
		
	}

}

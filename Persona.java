package clases;

public class Persona {
	
	String nombre ;
	String apellido;
	String sexo;
	int edad;
	int peso;
	
	
	public Persona ()
	{
		nombre="n/a";
		apellido="n/a";
		sexo="n/a";
		edad=0;
		peso=0;
	}
	
	public Persona (String nombre , String apellido , String sexo , int edad , int peso)
	{
		this.nombre=nombre;
		this.apellido=apellido;
		this.sexo=sexo;
		this.edad=edad;
		this.peso=peso;
		
	}

	
	public void imprimir()
	{
		System.out.println("el nombre de la persona es" + nombre + " " +apellido +"su sexo es " + sexo + "la edad es " +edad + "el peso es de "+ peso + "lb");
	}
}

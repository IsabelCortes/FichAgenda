package FernandoBrezal;

//Vamos a trabajar con los datos de una agenda de contactos:

import java.util.Date; // Fernando Brezal pone nacimiento de tipo Date (Fecha) 

public class Contacto
{
	private	String	nombre;
	private	String	telefono;
	private	String	email;
	private	String	dirección;
	private	Date	nacimiento;
	private	int	grupo;
	private	double	deuda;
	// Constantes simbólicas
	public	static	final	int	TRABAJO	=	1;
	public	static	final	int	FAMILIA	=	2;
	public	static	final	int	AMIGOS	=	3;

// Constructor
public Contacto (String nombre)
	{this.nombre = nombre;
	}
// Salida estándar -----> darle forma al contacto en 3 lineas
public String toString ()
	{
	return nombre + "(" + email + ")\n"
		+	" Teléfono: "+ telefono + "\n"
		+ " Cumpleaños: "+ nacimiento + "\n"+ " Deuda: "+ deuda +"€";
    }
// añadirlo con RESOURCE  // Métodos set & get  ...

public String getNombre() {	return nombre;}

public void setNombre(String nombre) {	this.nombre = nombre;}

public String getTelefono() {	return telefono;}

public void setTelefono(String telefono) {	this.telefono = telefono;}

public String getEmail() {	return email;}

public void setEmail(String email) {	this.email = email;}

public String getdirección() {	return dirección;}

public void setdirección(String dirección) {	this.dirección = dirección;}

public Date getNacimiento() {	return nacimiento;}

public void setNacimiento(Date nacimiento) {	this.nacimiento = nacimiento;}

public int getGrupo() {	return grupo;}

public void setGrupo(int grupo) {	this.grupo = grupo;}

public double getDeuda() {	return deuda;}

public void setDeuda(double deuda) {	this.deuda = deuda;}		
}

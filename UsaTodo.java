package FernandoBrezal;

import java.io.IOException; import java.util.Date;
/*La clase auxiliar ContactoReader nos permite ir leyendo los datos de los contactos en el mismo orden en el que están en el fichero (acceso secuencial).
 */
public class UsaTodo // sirve para LeerContactos
{
public static void main( String args[] ) throws IOException, java.text.ParseException
{
	Contacto	contacto;
	ContactoReader entrada;

// Lectura de datos
entrada = new ContactoReader();
entrada.abrir();
do {
	contacto= entrada.leer();   //recupera un contacto (7 lineas consecutivas) 
	System.out.println(contacto);  // le da forma con toString()
	} while (contacto!=null);
entrada.cerrar();
}
}


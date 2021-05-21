package FernandoBrezal;

import java.io.*; import java.util.Date;
import java.text.DateFormat;

public class ContactoWriter
{
private	FileWriter	writer;
private	BufferedWriter	buffer;
private	PrintWriter	output;

// Apertura del fichero de texto
//para poder escribir datos en el debe abrirse primero 
public void abrir() throws IOException
{
try {
	writer	=	new	FileWriter("c:\\Ficheros\\clientes.txt" ); 
	buffer	=	new	BufferedWriter(writer);	
	output	=	new	PrintWriter(writer);	

} catch (SecurityException securityException) {

System.err.println ("No tiene permiso para escribir en el fichero");
throw securityException;

} catch (FileNotFoundException fileException) {

System.err.println ("Error al crear el fichero" ); 
throw fileException;
}
}

// Cierre del fichero de texto

public void cerrar()  throws IOException
	{
	if ( output != null ) output.close();
	}

	//Escribir los datos de un contacto (7 lineas ) en el fichero

public void escribir (Contacto contacto)
{
DateFormat df; String	str;
df = DateFormat.getDateInstance(DateFormat.LONG); 
if (contacto!=null) {
output.println(contacto.getNombre());
output.println(contacto.getTelefono()); output.println(contacto.getEmail()); 
output.println(contacto.getdirección());

str = df.format(contacto.getNacimiento()); output.println(str);

output.println(contacto.getGrupo()); output.println(contacto.getDeuda());
}
}
///////////// todo getdirección y no getDirección
///////////// el contacto que se pasa es de tipo Contacto 
}


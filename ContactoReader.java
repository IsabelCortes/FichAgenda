package FernandoBrezal;

import java.io.*; import java.util.Date;
import java.text.DateFormat;

public class ContactoReader
{
private FileReader	reader; 
private BufferedReader input;

// Apertura del fichero de texto

public void abrir() throws IOException
{
try {  reader = new FileReader( "c:\\Ficheros\\clientes.txt" );
      input = new BufferedReader(reader);

} catch (SecurityException securityException) {

   System.err.println ("No tiene permiso para leer el fichero");
   throw securityException;

} catch (FileNotFoundException fileException) {

        System.err.println ("Error al acceder al fichero");
        System.exit(-1);      //  throw fileNotFoundException;
         }
}

// Cierre del fichero de texto

public void cerrar() throws IOException
	{
	if ( input != null ) input.close();
	}

//Lectura de datos del fichero de texto

public Contacto leer () throws IOException,
	NumberFormatException, java.text.ParseException
		{
		Contacto	contacto = null;
		Date	fecha;
		DateFormat df;
		int	grupo;
		double	deuda;
		String	str;
		
		df = DateFormat.getDateInstance(DateFormat.LONG);
	//leer una linea y luego 6 mas para los datos de un contacto 
		str = input.readLine();
		if (str!=null) {
			contacto = new Contacto (str);
			
			contacto.setTelefono (input.readLine()); contacto.setEmail (input.readLine()); 
			contacto.setdirección (input.readLine());
			fecha = df.parse(input.readLine()); contacto.setNacimiento (fecha);
			
			grupo = Integer.parseInt(input.readLine()); contacto.setGrupo(grupo);
			
			deuda = Double.parseDouble(input.readLine()); contacto.setDeuda(deuda);
			}

return contacto;	//EL ULTIMO SERA NULL Y SE MOSTRARLA 
}

}


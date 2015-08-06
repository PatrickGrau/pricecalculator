/**
 * Created by pgrau on 06/08/15.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvExport
{
	public static FileWriter writer;
	public static File file;

	public static void writeCSV(String ItemNo, double Price) throws IOException
	{
		// File anlegen
		file = new File("/Users/pgrau/Desktop/Preiskalkulation.csv");
		try
		{
			// new FileWriter(file ,true) - prüft ob die Datei vorhanden ist
			// wenn ja wird am Ende weiter geschrieben
			// new FileWriter(file) - wird überschrieben
			writer = new FileWriter(file, true);

			// Text wird in den Stream geschrieben
			writer.write("ItemNo;Price");

			// Platformunabhängiger Zeilenumbruch wird in den Stream geschrieben
			writer.write(System.getProperty("line.separator"));

			// Text wird in den Stream geschrieben
			writer.write(ItemNo + ";"+ Price);


			// Schreibt den Stream in die Datei
			// Sollte immer am Ende ausgeführt werden, sodass der Stream
			// leer ist und alles in der Datei steht.
			writer.flush();

			// Schließt den Stream
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}



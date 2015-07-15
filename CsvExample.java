import java.io.*;
import com.opencsv.CSVReader;

/* 
 * Example of using external library in a JAR format
 *
 * Compile like this:
 * $ javac -cp ~/Downloads/opencsv-3.4.jar CsvExample.java
 *
 * Launch like this:
 * $ java -cp ~/Downloads/opencsv-3.4.jar:. CsvExample
 *
 * Notice that for launching we also add current dir to classpath.
 */
public class CsvExample {
	public static void main (String [] args) throws Exception
	{
		CSVReader reader = new CSVReader(new FileReader("yourfile.csv"));
		String [] nextLine;
		while ((nextLine = reader.readNext()) != null) {
			// nextLine[] is an array of values from the line
			System.out.println(nextLine[0] + nextLine[1] + "etc...");
		}
	}
}

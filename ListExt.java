import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

class ListExt
{
	public static void main (String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		String extension = scanner.next();

		File curDir = new File(".");
		String[] list = curDir.list((dir, name) -> { 
			// XXX: curDir here is a so called free variable
			// it's not a parameter and not defined inside lambda.
			System.out.println(curDir.getName());
			return name.endsWith(extension); 
		});

		for (String fname : list)
		{
			System.out.println(fname);
		}
	}
}

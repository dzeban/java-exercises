import java.io.File;
import java.io.FileFilter;

class ListSubdirs
{
	public static void main (String [] args)
	{
		File curDir = new File(".");

		// Example of Lambda expression
		// File[] list = curDir.listFiles((f) -> { return f.isDirectory(); });
		
		// Example of method reference
		// File[] list = curDir.listFiles(File::isDirectory);

		// Example of anonymous inner class
		File[] list = curDir.listFiles(new FileFilter() {
			public boolean accept(File f) { return f.isDirectory(); }
		});

		for (File f : list)
		{
			System.out.println(f.getName());
		}
	}
}

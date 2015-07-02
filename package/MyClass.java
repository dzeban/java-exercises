import java.util.*;
import static mypackage.Util.*;

public class MyClass
{
	public static void main (String [] args)
	{
		Properties properties = System.getProperties();
		properties.list(System.out);

		// Qualified name can be used with "import mypackage.*"
		// System.out.println(Util.utilMethod(3, 4));

		// But if you want to use static member without qualifier, 
		// use "import static mypackage.Util.*"
		System.out.println(utilMethod(3, 4));

	}
}

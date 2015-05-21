class DefaultVal
{
	private int instance_integer;
	private boolean instance_boolean;
	private double instance_double;
	private String instance_string;

	public void method()
	{
		// Local variables can't be used without initializing
		// int local_integer;
		// String local_string;
		int local_integer = 1;
		String local_string = "Onotole";

		System.out.println("Instance vars:");
		System.out.println("Integer: " + instance_integer);
		System.out.println("Boolean: " + instance_boolean);
		System.out.println("Double: " + instance_double);
		System.out.println("String: " + instance_string);

		System.out.println("Local vars:");
		System.out.println("Integer: " + local_integer);
		System.out.println("String: " + local_string);
	}

}

class DefaultValRunner
{
	public static void main(String[] args)
	{
		DefaultVal dv = new DefaultVal();

		dv.method();
	}
}

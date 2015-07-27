import java.util.Random;

interface Measurable 
{
	double getMeasure();
}

class Employee implements Measurable 
{
	private double salary;

	public Employee(double salary)
	{
		this.salary = salary;
		System.out.println("New employee with salary " + salary);
	}

	public double getMeasure()
	{
		return salary;
	}

	public static Measurable largest(Measurable[] objects)
	{
		Measurable largestObject = null;
		double max = 0.0;

		for (Measurable m : objects)
		{
			if (m.getMeasure() > max)
			{
				max = m.getMeasure();
				largestObject = m;
			}
		}
		return largestObject;
	}

	public static double average(Measurable[] objects)
	{
		double sum = 0;
		for (Measurable m : objects)
		{
			sum += m.getMeasure();
		}

		return sum / objects.length;
	}

	public static void main (String [] args)
	{
		final int N = 10;
		Random randGen = new Random();

		Measurable[] staff = new Measurable[N];
		for (int i = 0; i < N; i++)
		{
			staff[i] = new Employee(randGen.nextDouble() * 50000);
		}

		System.out.println(average(staff));
		Measurable richEmployee = largest(staff);
		System.out.println(richEmployee.getMeasure());
	}
}

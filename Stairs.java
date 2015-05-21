public class Stairs 
{
	public static int NumberOfSteps(int n, int m)
	{
		int min = (int)Math.ceil(n / 2.0);

		while (min <= n)
		{
			if (min % m == 0)
				break;
			min++;
		}

		if (min > n)
			return -1;
		else
			return min;
	}

	public static void main(String[] args)
	{
		System.out.println(NumberOfSteps(10, 2));
		System.out.println(NumberOfSteps(3, 5));
	}
}

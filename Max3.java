import java.util.*;

class Max3 {
	public static void main (String [] args)
	{
		Scanner scanner = new Scanner(System.in);

		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int max;

		if (n1 > n2)
		{
			if (n2 > n3)
				max = n1;
			else if (n3 > n1)
				max = n3;
			else
				max = n1;
		}
		else
		{
			if (n1 > n3)
				max = n2;
			else if (n3 > n2)
				max = n3;
			else
				max = n2;
		}

		System.out.println(max);
	}
}

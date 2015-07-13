import java.math.*;
import java.util.Scanner;

class Factorial
{
	public static void main (String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		BigInteger x = BigInteger.valueOf(1);

		while (n > 0)
		{
			x = x.multiply(BigInteger.valueOf(n));
			n--;
		}

		System.out.println(x.toString());
	}
}

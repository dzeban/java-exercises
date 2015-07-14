import java.util.*;

class AngleNormalizer 
{
	public static void main (String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		int angle = scanner.nextInt();

		// Angle may be negative, so after first modulo
		// make it positive and normalize again.
		int normalized1 = (angle % 360 + 360) % 360;

		// Alternatively, we can use floorMod operation
		int normalized2 = Math.floorMod(angle, 360);

		System.out.println(normalized1);
		System.out.println(normalized2);
	}
}

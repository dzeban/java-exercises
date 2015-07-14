import java.util.*;

class NonAscii {
	public static void main (String [] args)
	{
		int codePoint;
		String s;

		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext())
		{
			s = scanner.next();
			for (char c : s.toCharArray())
			{
				codePoint = (int)c;
				if (codePoint > 127)
					System.out.printf("%c %d '%s'\n", c, codePoint, Character.getName(c));
			}
		}
	}
}

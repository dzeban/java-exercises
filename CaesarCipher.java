import java.util.*;

public class CaesarCipher 
{
	private static int splitParts = 5;
	private static String alphabet = "abcdefghijklmnopqrstuvwxyz";

	private static String crypt(String s, int shift, String op)
	{
		int length = s.length();
		StringBuilder encrypted = new StringBuilder(length);
		for (int i = 0; i < length; i++)
		{
			char shiftChar;
			boolean isUpperCase = false;

			char origChar = s.charAt(i);
			if (Character.isUpperCase(origChar))
			{
				isUpperCase = true;
				origChar = Character.toLowerCase(origChar);
			}

			int index = alphabet.indexOf(origChar);
			if (index < 0)
			{
				shiftChar = origChar;
			}
			else
			{
				switch (op)
				{
					case "encrypt":
						index = (index + shift) % alphabet.length();
						break;
					case "decrypt":
						index = (index - shift) % alphabet.length();
						if (index < 0)
							index = alphabet.length() - Math.abs(index);
						break;
					default:
						System.err.println("Unknown operation " + op);
						return null;
				}

				shiftChar = alphabet.charAt(index);
				if (isUpperCase)
				{
					shiftChar = Character.toUpperCase(shiftChar);
				}
			}
			encrypted.append(shiftChar);
			shift++;
		}

		return encrypted.toString();
	}

	private static String encrypt(String s, int shift)
	{
		return crypt(s, shift, "encrypt");
	}

	private static String decrypt(String s, int shift)
	{
		return crypt(s, shift, "decrypt");
	}

	private static List<String> split(String msg, int parts)
	{
		int msglen = msg.length();
		int sublen = (int)Math.ceil((double)msglen / parts);
		List<String> list = new ArrayList<String>();

		int begin = 0;
		int end = sublen;
		while (parts-- != 0)
		{
			list.add(msg.substring(begin, end));
			begin += sublen;
			end = Math.min((end + sublen), msglen);
		}

		return list;
	}

	public static List<String> movingShift(String s, int shift) 
	{
		String encrypted = encrypt(s, shift);
		return split(encrypted, splitParts);
	}

	public static String demovingShift(List<String> s, int shift) 
	{
		StringBuilder sb = new StringBuilder();
		for (String part : s)
		{
			sb.append(part);
		}
		return decrypt(sb.toString(), shift);
	}

	public static void main (String [] args)
	{
		String u = "I should have known that you would have a perfect answer for me!!!";
		List<String> v = Arrays.asList("J vltasl rlhr ", "zdfog odxr ypw", " atasl rlhr p ", "gwkzzyq zntyhv", " lvz wp!!!");
		List<String> w = movingShift(u, 1);
		for (int i = 0; i < w.size(); i++)
		{
			if (w.get(i).equals(v.get(i)))
			{
				System.out.printf("'%s' - OK\n", w.get(i));
			}
			else
			{
				System.out.printf("'%s'(%d) should be '%s'(%d)\n", w.get(i), w.get(i).length(), v.get(i), v.get(i).length());
			}
		}

		System.out.println(demovingShift(v, 1));
	}
}

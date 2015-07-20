import java.util.*;

class LuckySort
{
	private final static int THRESHOLD = 1000;

	public static boolean ordered(List<String> list, Comparator<String> comp)
	{
		String o1, o2;
		for (int i = 0; i < list.size() - 1; i++)
		{
			o1 = list.get(i);
			o2 = list.get(i + 1);
			if (comp.compare(o1, o2) > 0)
				return false;
		}
		return true;
	}

	public static void luckySort(List<String> strings, Comparator<String> comp)
	{
		int i = 0;
		while (ordered(strings, comp) == false && (i++ < THRESHOLD))
		{
			Collections.shuffle(strings);
		}

		if (i > THRESHOLD)
			System.out.println("Give up on threshold");
	}

	public static void main (String [] args)
	{
		List<String> list = Arrays.asList("aaa", "ccc", "bcc", "ccb");
		luckySort(list, String.CASE_INSENSITIVE_ORDER);
		for (String s : list)
			System.out.println(s);
	}
}

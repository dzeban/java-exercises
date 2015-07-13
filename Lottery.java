import java.util.*;

class Lottery {

	/**
	 * Returns a pseudo-random number between min and max, inclusive.
	 * The difference between min and max can be at most
	 * <code>Integer.MAX_VALUE - 1</code>.
	 *
	 * @param min Minimum value
	 * @param max Maximum value.  Must be greater than min.
	 * @return Integer between min and max, inclusive.
	 * @see java.util.Random#nextInt(int)
	 */
	public static int randInt(int min, int max) {

		// NOTE: Usually this should be a field rather than a method
		// variable so that it is not re-seeded every call.
		Random rand = new Random();

		// nextInt is normally exclusive of the top value,
		// so add 1 to make it inclusive
		int randomNum = rand.nextInt((max - min) + 1) + min;

		return randomNum;
	}

	private static void printArray(int[] a)
	{
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println("");
	}

	public static void main (String [] args)
	{
		final int n = 49;
		final int s = 6;
		List<Integer> numbers = new LinkedList<Integer>();

		for (int i = 1; i <= n; i++)
			numbers.add(i);

		Random random = new Random();
		int index;
		int[] seq = new int[s];
		for (int i = 0; i < s; i++) {
			index = randInt(1, numbers.size());
			seq[i] = numbers.remove(index);
		}
		printArray(seq);
		Arrays.sort(seq);
		printArray(seq);
	}
}

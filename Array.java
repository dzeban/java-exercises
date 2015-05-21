import java.util.ArrayList;

class ArrayTest
{
	public static void main (String[] args)
	{
		int[] array = new int[4];

		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;

		System.out.printf("%d %d %d %d", array[0], array[1], array[2], array[3]);
	}
}

class ArrayListTest
{
	public static void main (String [] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(55, 3);

		System.out.println(list);
	}
}

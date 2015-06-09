public class A3
{ 
	public static void main(String[] args)  
	{
		Integer i1 = 128;
		Integer i2 = 128;
		System.out.printf("%b %b\n", i1 == i2, i1.equals(i2));

		Integer i3 = 127;
		Integer i4 = 127;
		System.out.println(i3 == i4);
	}
}

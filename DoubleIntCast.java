class DoubleIntCast {
	public static void main (String [] args)
	{
		double d = Integer.MAX_VALUE;
		d += 9999999999.1234;
		int i = (int)d;
		System.out.printf("%f\n%d\n%d\n", d, i, Integer.MAX_VALUE);
	}
}

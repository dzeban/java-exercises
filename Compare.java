class Compare
{
	public static void main (String [] args)
	{
		String s1 = "Onotole";
		String s2 = "";

		s2 = s2.concat(s1);

		System.out.println("s1 " + s1 + " s2 " + s2);
		System.out.println("s1 == s2: " + (s1 == s2));
		System.out.println("s1.equals(s2): " + s1.equals(s2));
	}
}

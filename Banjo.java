class Banjo 
{
	public static String areYouPlayingBanjo(String name) 
	{
		String s;
		char c = name.charAt(0);
		if (c == 'r' || c == 'R')
			s = String.format("%s plays banjo", name);
		else
			s = String.format("%s does not play banjo", name);

		return s;
	}
}

class BanjoTest
{
	public static void main (String [] args)
	{
		System.out.println(Banjo.areYouPlayingBanjo("Robert"));
		System.out.println(Banjo.areYouPlayingBanjo("rita"));
		System.out.println(Banjo.areYouPlayingBanjo("arnold"));
		System.out.println(Banjo.areYouPlayingBanjo("Heinrich"));
	}
}

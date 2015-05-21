public class Dubstep
{
	public static String SongDecoder(String song)
	{
		return song.replaceAll("(WUB)+", " ").trim();
	}

	public static void main (String [] args)
	{
		System.out.println(SongDecoder("WUBWUBABCWUB"));
		System.out.println(SongDecoder("RWUBWUBWUBLWUB"));
	}
}

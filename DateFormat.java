import java.util.Date;

class DateFormat
{
	public static void main (String [] args)
	{
		String s;

		s = String.format("%tA %<tB %<td %<tY", new Date());
		System.out.println(s);
	}
}

public class BinaryGCD 
{
    public static int gcdBinary(int x, int y) 
    {
        int ret = 0;
        if (x == 0)
        {
            ret = Math.abs(y);
        }
        else  if (y == 0)
        {
            ret = Math.abs(x);
        }
        else
        {
            while (x != 0 && y != 0)
            {
                int t = y;
                y = x % y;
                x = t;
            }
            ret = Math.abs(x);
        }
        return Integer.bitCount(ret);
    }

	public static void main (String [] args)
	{
		System.out.println(gcdBinary(666666, 333111));
		System.out.println(gcdBinary(545034, 5));
		System.out.println(gcdBinary(0, 0));
		System.out.println(gcdBinary(0, 76899299));
		System.out.println(gcdBinary(-124, -16));
	}
}


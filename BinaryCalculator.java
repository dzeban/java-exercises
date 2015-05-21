public class BinaryCalculator 
{
    public static String calculate(String n1, String n2, String o) 
    {
        int i1, i2, res;

        i1 = Integer.parseInt(n1, 2);
        i2 = Integer.parseInt(n2, 2);

        switch (o)
        {
            case "add":
                res = i1 + i2;
                break;
            case "subtract":
                res = i1 - i2;
                break;
            case "multiply":
                res = i1 * i2;
                break;
            default:
                return null;
        }

        // We don't use two's complement, 
        // we prepend "-" to string.
        if (res < 0) {
            res = Math.abs(res);
            return "-" + Integer.toBinaryString(res);
        }
        
        return Integer.toBinaryString(res);
    }

    public static void main (String [] args)
    {
        System.out.println(calculate("1", "1", "add"));
        System.out.println(calculate("1", "1", "subtract"));
        System.out.println(calculate("10", "10", "multiply"));
        System.out.println(calculate("1", "10", "subtract"));
        System.out.println(calculate("10", "100", "subtract"));
    }
}

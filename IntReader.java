import java.util.Scanner;

public class IntReader
{
    public static void main (String [] args)
    {
        int x;
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            x = scanner.nextInt();
            System.out.println(Integer.toBinaryString(x) + " " + 
                               Integer.toOctalString(x) + " " + 
                               Integer.toHexString(x));
        }
    }
}

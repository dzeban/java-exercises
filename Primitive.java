import java.math.*;

public class Primitive 
{
    public String determineType(String number) 
    {
        BigInteger bigint = new BigInteger(number, 10);
        int bytes = bigint.toByteArray().length;

        // Pattern matching, where are you?
        if (bytes == 1)
            return "byte";
        else if (bytes == 2)
            return "short";
        else if (bytes <= 4)
            return "int";
        else if (bytes <= 8)
            return "long";
        else
            return "none";
    }

    public static void main (String [] args)
    {
        Primitive p = new Primitive();

        System.out.println("short " +  p.determineType("-129"));
        System.out.println("byte " +  p.determineType("-128"));
        System.out.println("byte " +  p.determineType("-127"));
        System.out.println("byte " +  p.determineType("127"));
        System.out.println("short " +  p.determineType("128"));
        System.out.println("short " +  p.determineType("129"));
        System.out.println("int " +  p.determineType("-803847"));
        System.out.println("none " +  p.determineType("9173654782928177561848183754729818437466"));
        System.out.println("short " +  p.determineType("3573"));
        System.out.println("long " +  p.determineType("-5745621829365")); 
    }
}

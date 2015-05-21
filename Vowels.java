public class Vowels 
{
    public static int getCount(String str) 
    {
        int vowelsCount = 0;
        final String vowels = "aeiou";

        for (int i = 0; i < str.length(); i++)
        {
            if (vowels.indexOf(str.charAt(i)) != -1) 
                vowelsCount++;
        }

        return vowelsCount;
    }

    public static int getCount2(String str)
    {
        return str.replaceAll("[^AEIOUaeiou]", "").length();
    }

    public static void main (String [] args)
    {
        System.out.println(getCount("aaabi"));
        System.out.println(getCount("bnxcv"));
        System.out.println(getCount("popopo"));

        System.out.println(getCount2("aaabi"));
        System.out.println(getCount2("bnxcv"));
        System.out.println(getCount2("popopo"));
    }

}

import java.util.ArrayList;
import java.util.List;

public class SqInRect 
{
    private static List<Integer> sqInRectIterative(int length, int width)
    {
        if (length == width)
            return null;

        ArrayList<Integer> squares = new ArrayList<Integer>();

        while (length != 0 && width != 0)
        {
            int side = Math.min(length, width);
            squares.add(side);
            if (length > width)
                length -= side;
            else
                width -= side;
        }

        return squares;
    }

    private static void sqInRectRecursiveSub(int length, int width, List<Integer> list)
    {
        if (length == 0 || width == 0)
            return;

        if (length > width)
        {
            list.add(width);
            sqInRectRecursiveSub(length - width, width, list);
        }
        else
        {
            list.add(length);
            sqInRectRecursiveSub(length, width - length, list);
        }
    }

    private static List<Integer> sqInRectRecursive(int length, int width)
    {
        if (length == width)
            return null;

        ArrayList<Integer> squares = new ArrayList<Integer>();        

        sqInRectRecursiveSub(length, width, squares);
        return squares;
    }

    public static List<Integer> sqInRect(int length, int width)
    {
        return sqInRectRecursive(length, width);
    }

    public static void main(String[] args)
    {
        System.out.println(sqInRect(2, 5));
        System.out.println(sqInRect(5, 3));
        System.out.println(sqInRect(5, 5));
    }
}


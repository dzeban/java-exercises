import java.util.List;
import java.util.Arrays;

public class PaginationHelper<I> 
{
    private final int itemsPerPage;
    private final int itemCount;
    private final int pageCount;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) 
    {
        this.itemsPerPage = itemsPerPage;
        itemCount = collection.size();
        pageCount = (int)Math.ceil((double)itemCount / itemsPerPage);
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() 
    {
        return itemCount;
    }

    /**
     * returns the number of pages
     */
    public int pageCount() 
    {
        return pageCount;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) 
    {
        if (pageIndex < 0)
            return -1;

        if (pageIndex >= pageCount)
            return -1;
        else if (pageIndex == pageCount - 1)
            return itemCount % itemsPerPage;
        else
            return itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) 
    {
        if (itemIndex < 0)
            return -1;

        if (itemIndex >= itemCount)
            return -1;

        return itemIndex / itemsPerPage;
    }

    public static void main (String [] args)
    {
        PaginationHelper<Integer> p = new PaginationHelper<Integer>(Arrays.asList(1,2,3,4,5,6,7,8), 3);

        System.out.printf("Item count: %d\n", p.itemCount());
        System.out.printf("Page count: %d\n", p.pageCount());
        System.out.println("Page indexes");
        System.out.println(p.pageIndex(0));
        System.out.println(p.pageIndex(1));
        System.out.println(p.pageIndex(2));
        System.out.println(p.pageIndex(-1));

        System.out.println("Page items");
        System.out.println(p.pageItemCount(0));
        System.out.println(p.pageItemCount(1));
        System.out.println(p.pageItemCount(2));
        System.out.println(p.pageItemCount(3));
        System.out.println(p.pageItemCount(4));

    }
}

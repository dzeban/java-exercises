import java.util.List;
import java.util.Arrays;
import java.util.HashMap;

public class BallotsCounter 
{
    public static String getWinner2(final List<String> listOfBallots) 
    {
        HashMap<String, Integer> election = new HashMap<String, Integer>();

        int totalVotes = 0;
        String winnerName = null;
        int winnerCount = 0;
        for (String ballot : listOfBallots)
        {
            Integer count = election.get(ballot);
            if (count == null)
                count = 0;

            count++;
            election.put(ballot, count);
            
            if (count > winnerCount) {
                winnerName  = ballot;
                winnerCount = count;
            }
            totalVotes++;
        }

        return (winnerCount > totalVotes/2) ? winnerName : null;
    }

    public static String getWinner(final List<String> listOfBallots) 
    {
        HashMap<String, Integer> election = new HashMap<String, Integer>();

        for (String ballot : listOfBallots)
        {
            Integer count = election.get(ballot);
            if (count == null)
                count = 0;

            election.put(ballot, count + 1);
        }

        int totalVotes = 0;
        String winnerName = null;
        int winnerCount = 0;
        for (String candidate : election.keySet())
        {
            Integer count = election.get(candidate);
            if (count > winnerCount) {
                winnerName  = candidate;
                winnerCount = count;
            }

            totalVotes += count;
        }

        return (winnerCount > totalVotes/2) ? winnerName : null;
    }

    public static void main(String[] args)
    {
        System.out.println(getWinner2(Arrays.asList("A", "A", "A", "B", "B", "B", "A")));
        System.out.println(getWinner2(Arrays.asList("A", "A", "A", "B", "B", "B")));
        System.out.println(getWinner2(Arrays.asList("A", "A", "A", "B", "C", "B")));
        System.out.println(getWinner2(Arrays.asList("A", "A", "B", "B", "C")));
    }
}

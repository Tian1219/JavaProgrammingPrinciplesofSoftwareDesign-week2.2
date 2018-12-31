import java.util.*;

public class TitleLastAndMagnitudeComparator implements Comparator<QuakeEntry> {

    public int compare(QuakeEntry q1, QuakeEntry q2) {
        String q1Tile = q1.getInfo();
        String q2Tile = q2.getInfo();

        String q1LastWord = q1Tile.substring(q1Tile.lastIndexOf(" ") + 1);
        String q2LastWord = q2Tile.substring(q2Tile.lastIndexOf(" ") + 1);

        int value = q1LastWord.compareTo(q2LastWord);

        if (value == 0) {
            return Double.compare(q1.getMagnitude(), q2.getMagnitude());
        }
        return value;
    }
}

import java.util.*;


public class TitleAndDepthComparator implements Comparator<QuakeEntry> {

    public int compare(QuakeEntry q1, QuakeEntry q2) {
        String q1Tile = q1.getInfo();
        String q2Tile = q2.getInfo();

        int value = q1Tile.compareTo(q2Tile);

        if (value == 0) {
            value = Double.compare(q1.getDepth(), q2.getDepth());
        }
        return value;
    }

}

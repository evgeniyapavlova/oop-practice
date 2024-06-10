package practice3;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream g1, Stream g2) {
        return g1.sgList.size() - g2.sgList.size();
    }
}

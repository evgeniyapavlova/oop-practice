package practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    List<Stream> streamList = new ArrayList<>();

    public StreamService(List<Stream> streamList) {
        this.streamList = streamList;

    }

    public void sort() {
        Collections.sort(streamList, new StreamComparator());
    }

    @Override
    public String toString() {
        return streamList.toString();
    }
}

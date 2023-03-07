package visiterPattern;

import java.util.Iterator;
import java.util.LinkedList;

public class Directory extends Entry {
    String name;
    int size;
    private LinkedList<Entry> list = new LinkedList<Entry>();

    public Directory(String name) {
        this.name = name;
        this.size = 0;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Entry entry : list) {
            size += entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        list.add(entry);
        return entry;
    }

    @Override
    public Iterator<Entry> iterator() throws FileTreatmentException {
        return list.iterator();
    }
}
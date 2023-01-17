package data.iterators;

import data.StudentGroup;
import data.GroupStream;

import java.util.Iterator;
import java.util.List;


public class GroundStreamIterator implements Iterator<StudentGroup> {

    private int cursor;
    private final GroupStream groundStream;
    private final List<StudentGroup> studentGroups;

    public GroundStreamIterator(int cursor, GroupStream groundStream, List<StudentGroup> studentGroups) {
        this.cursor = cursor;
        this.groundStream = groundStream;
        this.studentGroups = studentGroups;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public StudentGroup next() {
        return null;
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}

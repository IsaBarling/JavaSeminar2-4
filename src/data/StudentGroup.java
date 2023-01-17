package data;

import java.util.Iterator;
import java.util.List;
import data.iterators.StudentGroupIterator;

public class StudentGroup implements Iterator<Student> {
    private Teacher teacher;
    private List<Student> studentList;
    private int groupNumber;

    public StudentGroup(){}

    public StudentGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public void StudentGroupNumber(int number)
    {
        this.groupNumber = number;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Student next() {
        return null;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public StudentGroupIterator iterator()
    {
        return new StudentGroupIterator();
    }
}

package service;

import data.Student;
import data.Teacher;
import data.User;

public interface DataService <U extends User> {
    void write (User user);
    User read (User user);

    void write(Teacher user);

    User read(Teacher user);

    void write(Student user);

    User read(Student user);
}

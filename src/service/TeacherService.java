package service;

import data.Student;
import data.Teacher;
import data.User;
import repository.TeacherRepository;

public class TeacherService implements DataService <Teacher>{

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void write(User user) {

    }

    @Override
    public User read(User user) {
        return null;
    }

    @Override
    public void write(Teacher user) {

    }

    @Override
    public User read(Teacher user) {
        return null;
    }

    @Override
    public void write(Student user) {

    }

    @Override
    public User read(Student user) {
        return null;
    }
}

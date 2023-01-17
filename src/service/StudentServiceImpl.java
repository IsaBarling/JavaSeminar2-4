package service;

import data.Teacher;
import data.User;
import util.ReaderFromTxt;
import util.WriterToTxt;
import repository.*;
import data.Student;
public class StudentServiceImpl implements DataService {

    private StudentRepository StudentRepository;

    @Override
    public void write(User user) {
        WriterToTxt.writes(user);
    }

    @Override
    public User read(User user) {
       return ReaderFromTxt.reads(user);

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

    public void saveStudent(Student student)
    {
        StudentRepository.save(student);
    }

    public Student findById(int id)
    {
        return (Student)StudentRepository.findById(id);
    }

    public Student findByFio(String fio)
    {
        return (Student)StudentRepository.findByFio(fio);
    }
}

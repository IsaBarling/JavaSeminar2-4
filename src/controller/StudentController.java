package controller;

import data.Student;
import service.StudentService;

public class StudentController  implements UserController<Student, Integer> {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }


    @Override
    public Student create(Student entity) {
        return null;
    }

    @Override
    public Student findById(Integer id) {
        return null;
    }

    @Override
    public Student findByLastName(String LastName) {
        return UserController.super.findByLastName(LastName);
    }
}

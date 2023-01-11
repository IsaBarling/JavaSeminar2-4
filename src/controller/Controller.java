package controller;

import java.util.Collections;

import data.Student;
import data.StudentGroup;
import service.DataService;
import service.GroupStreamServiceImpl;
import service.StudentGroupServiceImpl;
import service.StudentServiceImpl;

public class Controller {

    private DataService studentService;
    private GroupStreamServiceImpl groupStreamService;

    public Controller(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    public Student createStudent(Student student){
        studentService.write(student);
        studentService.read(student);
        return (Student) studentService.read(student);
    }

    public StudentGroup createGroup(int groupNumber){
        StudentGroup studentGroup = new StudentGroup();
        
        return null;
    }

    public void deleteStudent(StudentGroup studentGroup, String name){
        ((StudentGroupServiceImpl) studentService).deleteStByName(studentGroup , name);
    }

    public void sortStreams()
    {
        groupStreamService.sortGroupStreams();
    }



}

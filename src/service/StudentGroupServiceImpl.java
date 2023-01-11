package service;

import data.Student;
import data.StudentGroup;
import data.User;
import repository.GroupRepository;

import java.util.List;
import java.util.*;  


public class StudentGroupServiceImpl  {


    public void write(StudentGroup studentGroup) {

    }


    public StudentGroup read(StudentGroup studentGroup) {
        return null;
    }
    
    public void deleteStByName(StudentGroup studentGroup, String name){
        studentGroup.remove();
        List<Student> studentList = studentGroup.getStudentList();
        for (Student student: studentList){
            if (student.getName() == name){
                studentList.remove(student);

        }
        }
    }

    public void SortStudentsByAge(StudentGroup studentGroup)
    {
        List<Student> students = studentGroup.getStudentList();
        
        Collections.sort(students); 
    }

    public void SortStudentsByFuckingName(StudentGroup studentGroup)
    {
        List<User> students = (List<User>)(List<?>)studentGroup.getStudentList();     
        Collections.sort(students); 
    }

    public void saveGroup(StudentGroup studentGroup)
    {
        GroupRepository gr = new GroupRepository();
        gr.save(studentGroup);
    }

    public void findGroup(int groupNumber)
    {
        GroupRepository gr = new GroupRepository();
        gr.findById(groupNumber);
    }
}

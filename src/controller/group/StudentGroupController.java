package controller.group;

import data.group.StudentGroup;
import data.user.Student;
import service.group.StudentGroupService;

public class StudentGroupController implements UserGroupController<StudentGroup, Student>{

    private final StudentGroupService studentGroupService;

    public StudentGroupController(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    @Override
    public void sort(StudentGroup group) {

    }

    @Override
    public StudentGroup findById(int id) {
        return null;
    }

    @Override
    public void save(StudentGroup group) {

    }

    @Override
    public void remove(Student user, StudentGroup group) {

    }

    @Override
    public void sortByFio(StudentGroup group) {

    }
}

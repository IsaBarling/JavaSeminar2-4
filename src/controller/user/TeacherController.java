package controller.user;

import data.user.Teacher;
import service.user.TeacherService;

public class TeacherController implements UserController<Teacher, Integer>{
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher create(Teacher entity) {
        return null;
    }

    @Override
    public Teacher findById(Integer id) {
        return null;
    }

    @Override
    public Teacher findByLastName(String LastName) {
        return UserController.super.findByLastName(LastName);
    }
}

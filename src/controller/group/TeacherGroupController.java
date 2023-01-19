package controller.group;
import data.user.Teacher;
import data.group.TeacherGroup;
import service.group.TeacherGroupService;

public class TeacherGroupController implements UserGroupController<TeacherGroup, Teacher> {
    private final TeacherGroupService teacherGroupService;

    public TeacherGroupController(TeacherGroupService teacherGroupService) {
        this.teacherGroupService = teacherGroupService;
    }

    @Override
    public void sort(TeacherGroup group) {

    }

    @Override
    public TeacherGroup findById(int id) {
        return null;
    }

    @Override
    public void save(TeacherGroup group) {

    }

    @Override
    public void remove(Teacher user, TeacherGroup group) {

    }

    @Override
    public void sortByFio(TeacherGroup group) {

    }
}

package service.group;

import data.group.Group;
import data.group.StudentGroup;
import repository.GroupRepository;

public abstract class DataGroupService {

    private final GroupRepository groupRepository;

    protected DataGroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public abstract void sort(Group group);

    public void save(StudentGroup group) {
        groupRepository.save((StudentGroup) group);
    }

    public Group findById(int id) {
        return groupRepository.findById(id);
    }
}

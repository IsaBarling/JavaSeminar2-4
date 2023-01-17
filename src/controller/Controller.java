package controller;

import data.Student;
import data.StudentGroup;
import data.User;
import service.DataService;
import service.GroupStreamServiceImpl;
import service.StudentGroupServiceImpl;
import service.StudentServiceImpl;

public interface Controller<E extends User, I> {

    E create(E entity);

    E findById(I id);



    }


package controller;

import data.User;

public interface UserController <E extends User, I> extends Controller<E, I>{


    default E findByLastName(String LastName) {
        return null;
    }
}

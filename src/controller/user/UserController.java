package controller.user;

import controller.Controller;
import data.user.User;

public interface UserController <E extends User, I> extends Controller<E, I> {


    default E findByLastName(String LastName) {
        return null;
    }
}

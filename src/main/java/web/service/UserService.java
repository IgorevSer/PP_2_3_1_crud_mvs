package web.service;

import java.util.List;

import web.model.User;

public interface UserService {
    void add(User user);

    User getUser(long id);

    List<User> getAll();


    void delete(long id);

    void update(User user);
}
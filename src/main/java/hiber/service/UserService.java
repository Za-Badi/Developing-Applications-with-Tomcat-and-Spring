package hiber.service;

import model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();
    void update(User use);
    void removeUserById(long id);

}

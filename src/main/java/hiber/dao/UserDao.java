package hiber.dao;

import model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   void update(User user);
   void removeUserById(long id);



}

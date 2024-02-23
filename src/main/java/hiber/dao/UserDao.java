package hiber.dao;

import model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   void update(User user);
//   void saveUser(String name, String lastName, byte age);

   void removeUserById(long id);
//   void updateUser(User user);



}

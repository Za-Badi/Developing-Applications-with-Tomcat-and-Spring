package hiber.dao;

import model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @Autowired
   private SessionFactory sessionFactory;

   @Override
   public void add(User user) {
      sessionFactory.getCurrentSession().save(user);
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      TypedQuery<User> query=sessionFactory.getCurrentSession().createQuery("from User");
      return query.getResultList();
   }
   @Override
   public void update(User user) {
      sessionFactory.getCurrentSession().saveOrUpdate(user);
   }

   @Override
   public void removeUserById(long id) {
      Session session = sessionFactory.openSession();
      var entity  = session.getSession().get(User.class, id);
      sessionFactory.getCurrentSession().delete(entity);
   }






}

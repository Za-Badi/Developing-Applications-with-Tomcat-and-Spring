//package hiber;
//
//import hiber.config.AppConfig;
//import hiber.model.Car;
//import hiber.model.User;
//import hiber.service.UserService;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import java.sql.SQLException;
//import java.util.List;
//
//public class MainApp {
//   public static void main(String[] args) throws SQLException {
//      AnnotationConfigApplicationContext context =
//            new AnnotationConfigApplicationContext(AppConfig.class);
//
//      UserService userService = context.getBean(UserService.class);
////      userService.add(new User("User1", "Lastname1", "user1@mail.ru"));
////      userService.add(new User("User2", "Lastname2", "user2@mail.ru"));
////      userService.add(new User("User3zz", "Lastname3", "user3@mail.ru"));
////      userService.add(new User("User4", "Lastname4", "user4@mail.ru"));
//
//
//      User s = new User("zaha", "badi", "badi.zaha@gmail.com");
//      s.setCar(new Car("Spectra", 2010) );
//      userService.add(s);
//      List<User> users = userService.listUsers();
//      String carModel = "sona";
//      int carSeries = 555;
//      List<User> userswithcars = userService.listUsersWithCarModel(carModel, carSeries);
//      for (User user : users) {
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//         System.out.println();
//      }
//      for (User user : userswithcars) {
//         System.out.println("Total number of Users who have "+ carModel+", "+carSeries+" is "+userswithcars.size());
//         System.out.println("Id = "+user.getId());
//         System.out.println("First Name = "+user.getFirstName());
//         System.out.println("Last Name = "+user.getLastName());
//         System.out.println("Email = "+user.getEmail());
//
//         System.out.println();
//      }
//
//      context.close();
//   }
//}

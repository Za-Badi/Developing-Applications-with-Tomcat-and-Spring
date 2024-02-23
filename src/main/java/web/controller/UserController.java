package web.controller;
import hiber.config.AppConfig;
import model.User;
import hiber.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@Controller
public class UserController {

    @Autowired
    UserService userServiceContext;
    @GetMapping(value = "/" )
    public String printWelcome(ModelMap model,
                               @RequestParam(value = "count", required = false) Integer count) {
        List<User> users = userServiceContext.listUsers();
        model.addAttribute("userList",users);
        return "index";
    }
    @RequestMapping(value = "/delete/{id}" , method = RequestMethod.GET)
    public String deleteUser(  @PathVariable long id){

        userServiceContext.removeUserById(id);
        return "redirect:/";
    }
    @RequestMapping(value = "/add" , method = RequestMethod.GET)
    public String addUser(){
//        userServiceContext.update( new User( "zzzz", "badi", "badi.zaha@gmail.com"),6);
        return "add";
    }



    @RequestMapping(value = "/update")
    public String update(ModelMap model, @RequestParam(name = "name") String name, @RequestParam(name = "lastName") String lastName, @RequestParam(name = "email") String email , @RequestParam(name = "id") long id) {
        User user = new User(name, lastName, email);
        user.setId((long) id);
        model.addAttribute("user", user);
        return "edit";
    }

    @RequestMapping(value = "/edit_user")
    public String editUser(@RequestParam(name = "name") String name, @RequestParam(name = "lastName") String lastName, @RequestParam(name = "email") String email , @RequestParam(name = "id") long id) {
            User user = new User(name, lastName, email);
            user.setId((long) id);
            userServiceContext.update(user);


        return "redirect:/";
    }
    @RequestMapping(value = "/cancel")
    public String editUser(){
        return "redirect:/";
    }
    @GetMapping(value = "/new_user")
    public String printWelcome(ModelMap model, @RequestParam(name = "name") String name, @RequestParam(name = "lastName") String lastName, @RequestParam(name = "email") String email ) {
        userServiceContext.add(new User(name, lastName,email));
        return "redirect:/";
    }




}

package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {
    @GetMapping(value = "/car" )
    public String printWelcome(ModelMap model,
                               @RequestParam(value = "all", required = false) String all,
                               @RequestParam(value = "count", required = false) Integer count) {
        CarService carService = new CarService();
        all="";
        if(count == null || count <=0|| count >5 || all.equals("all")){
            model.addAttribute("carList", carService.listCars());
        }
        else{
            model.addAttribute("carList", carService.listCars(count));
        }



        return "car";
    }
//    @RequestMapping(value = "/car?count={count}" ,method = RequestMethod.GET)
//    public String printWelcome(ModelMap model) {
//        String count = "1";
//        System.out.println(count);
//        if(Integer.parseInt(count) == 0 || Integer.parseInt(count) > 5  ){
//            List<String> messages = new ArrayList<>();
//            messages.add("Congratulations!");
//            messages.add("You just launched a Car :)");
//            CarService carService = new CarService();
//
//            model.addAttribute("carList",  carService.listCars(Integer.parseInt(count)));
//            return "car";
//        }
//        else{
//            List<String> messages = new ArrayList<>();
//            messages.add("Congratulations!");
//            messages.add("You just launched a Car :)");
//            CarService carService = new CarService();
//
//            model.addAttribute("carList", carService.listCars());
//            return "car";
//
//        }

//    }
}

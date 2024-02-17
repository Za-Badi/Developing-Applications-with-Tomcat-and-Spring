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
                               @RequestParam(value = "count", required = false) Integer count) {
        CarService carService = new CarService();
        if(count == null || count <=0|| count >5){
            model.addAttribute("carList", carService.listCars());
        }
        else{
            model.addAttribute("carList", carService.listCars(count));
        }
        return "car";
    }

}

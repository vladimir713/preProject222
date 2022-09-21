package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        return "cars";
    }
}

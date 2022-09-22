package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService car;
    @Autowired
    public CarsController(CarService car) {
        this.car = car;
    }

    @GetMapping()
    public String show(@RequestParam(value = "count", required = false) String count, Model model) {
        if (count != null) {
            model.addAttribute("cars", car.show(Integer.parseInt(count)));
        } else {
            model.addAttribute("cars", car.index());
        }
        return "cars";
    }
}

package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    private CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam("count") int count, Model model) {
        model.addAttribute("carsKey", carService.getSomeCars(count));
        return "cars";
    }
}

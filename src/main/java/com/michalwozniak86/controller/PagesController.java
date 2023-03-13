package com.michalwozniak86.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagesController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/index")
    public String indexPage() {
        return "index";
    }

    @GetMapping("/add-car")
    public String addCar() {
        return "add-car";
    }

    @GetMapping("/cars-to-repair")
    public String carsToRepair() {
        return "cars-to-repair";
    }

    @GetMapping("/repair-car")
    public String repairCar() {
        return "repair-car";
    }

    @GetMapping("/repaired-cars")
    public String repairedCars() {
        return "repaired-cars";
    }
}

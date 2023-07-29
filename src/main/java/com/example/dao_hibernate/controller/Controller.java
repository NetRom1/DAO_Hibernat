package com.example.dao_hibernate.controller;


import com.example.dao_hibernate.entity.Person;
import com.example.dao_hibernate.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class Controller {
    private final Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("/persons/by-city")
    @ResponseBody
    public List<Person> getProduct(@RequestParam("city") String city) {
        return service.getPersonsByCity(city);
    }
}

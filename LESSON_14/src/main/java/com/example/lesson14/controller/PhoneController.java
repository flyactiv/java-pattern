package com.example.lesson14.controller;

import com.example.lesson14.Phone;
import com.example.lesson14.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PhoneController {
    @Autowired
    private PhoneService service;

    @PostMapping("/postPhones")
    public void post(@RequestBody Phone phone) {
        service.add(phone);
    }

    @GetMapping("/getPhones")
    public List<Phone> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/deletePhone")
    public void delete(@RequestBody Phone phone) {
        service.delete(phone);
    }
}

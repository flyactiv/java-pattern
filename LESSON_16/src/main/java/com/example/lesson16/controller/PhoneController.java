package com.example.lesson16.controller;

import com.example.lesson16.model.Manufacture;
import com.example.lesson16.model.Phone;
import com.example.lesson16.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class PhoneController {
    @Autowired
    private PhoneService service;

    @PostMapping("/phone")
    public void post(@RequestBody Phone phone) {
        service.addPhone(phone);
    }

    @GetMapping("/phones")
    public List<Phone> getAll() {
        return service.getPhones();
    }

    @GetMapping("/phone/{id}")
    public Phone get(@PathVariable UUID id) {
        return service.getPhone(id);
    }

    @DeleteMapping("/phone/{id}")
    public void delete(@PathVariable UUID id) {
        service.deletePhone(id);
    }
}

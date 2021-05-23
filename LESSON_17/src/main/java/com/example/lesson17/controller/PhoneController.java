package com.example.lesson17.controller;

import com.example.lesson17.model.Manufacture;
import com.example.lesson17.model.Phone;
import com.example.lesson17.service.PhoneService;
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

    @GetMapping("/phones/name/{name}")
    public List<Phone> getAllByName(@PathVariable String name) {
        return service.findPhonesByName(name);
    }

    @GetMapping("/phones/creationYear/{creationYear}")
    public List<Phone> getAllByCreationYear(@PathVariable int creationYear) {
        return service.findPhonesByCreationYear(creationYear);
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

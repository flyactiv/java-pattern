package com.example.lesson15.controller;

import com.example.lesson15.model.Manufacture;
import com.example.lesson15.service.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ManufactureController {
    @Autowired
    private ManufactureService service;

    @PostMapping("/manufacture")
    public void post(@RequestBody Manufacture manufacture) {
        service.addManufacture(manufacture);
    }

    @GetMapping("/manufactures")
    public List<Manufacture> getAll() {
        return service.getManufactures();
    }

    @GetMapping("/manufacture/{id}")
    public List<Manufacture> get(@PathVariable UUID id) {
        return service.getManufacture(id);
    }

    @DeleteMapping("/manufacture/{id}")
    public void delete(@PathVariable UUID id) {
        service.deleteManufacture(id);
    }
}

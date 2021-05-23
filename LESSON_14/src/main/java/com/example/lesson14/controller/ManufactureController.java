package com.example.lesson14.controller;

import com.example.lesson14.Manufacture;
import com.example.lesson14.service.ManufactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ManufactureController {
    @Autowired
    private ManufactureService service;

    @PostMapping("/postManufacture")
    public void postManufacture(@RequestBody Manufacture manufacture) {
        service.addManufacture(manufacture);
    }

    @GetMapping("/getManufactures")
    public List<Manufacture> getAll() {
        return service.getManufactures();
    }

    @DeleteMapping("/deleteManufacture")
    public void deleteManufacture(@RequestBody Manufacture manufacture) {
        service.deleteManufacture(manufacture);
    }
}

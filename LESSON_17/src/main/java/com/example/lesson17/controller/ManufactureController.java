package com.example.lesson17.controller;

import com.example.lesson17.model.Manufacture;
import com.example.lesson17.model.Phone;
import com.example.lesson17.service.ManufactureService;
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

    @GetMapping("/manufacture/name/{name}")
    public List<Manufacture> getAllByName(@PathVariable String name) {
        return service.findPhonesByName(name);
    }

    @GetMapping("/manufacture/address/{address}")
    public List<Manufacture> getAllByAddress(@PathVariable String address) {
        return service.findPhonesByAddress(address);
    }

    @GetMapping("/manufacture/{id}")
    public List<Manufacture> get(@PathVariable UUID id) {
        return service.getManufacture(id);
    }

    @DeleteMapping("/manufacture/{id}")
    public void delete(@PathVariable UUID id) {
        service.deleteManufacture(id);
    }

    @GetMapping("/manufacture/{id}/phones")
    public List<Phone> getPhonesByManufacture(@PathVariable UUID id) {
        return service.getPhonesByManufacture(id);
    }
}

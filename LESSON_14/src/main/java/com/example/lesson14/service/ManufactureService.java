package com.example.lesson14.service;

import com.example.lesson14.Manufacture;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ManufactureService {
    private List<Manufacture> manufactures;

    public ManufactureService() {
        manufactures = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        manufactures.add(new Manufacture("Alexandra", "Belyevo"));
        manufactures.add(new Manufacture("Ilya", "Novoperedelkino"));
        manufactures.add(new Manufacture("Kiril", "Tushino"));
    }

    public void addManufacture(Manufacture manufacture) {
        manufactures.add(manufacture);
    }

    public List<Manufacture> getManufactures() {
        return manufactures;
    }

    public void deleteManufacture(Manufacture manufacture) {
        manufactures.remove(manufacture);
    }
}

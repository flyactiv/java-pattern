package com.example.lesson14.service;

import com.example.lesson14.Phone;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneService {
    private List<Phone> phones;

    public PhoneService() {
        phones = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        phones.add(new Phone("Alexandra", 2019));
        phones.add(new Phone("Vasya", 2012));
        phones.add(new Phone("Ilya", 2015));
    }

    public void add(Phone phone) {
        phones.add(phone);
    }


    public List<Phone> getAll() {
        return phones;
    }


    public void delete(Phone phone) {
        phones.remove(phone);
    }
}

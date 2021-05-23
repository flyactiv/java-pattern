package com.example.lesson18.service;

import com.example.lesson18.model.Phone;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

public interface PhoneService {
    List<Phone> getPhones();

    Phone getPhone(UUID id);

    void addPhone(Phone phone);

    void deletePhone(UUID id);

    List<Phone> findPhonesByName(String name);

    List<Phone> findPhonesByCreationYear(int creationYear);
}


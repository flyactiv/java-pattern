package com.example.lesson18.repository;

import com.example.lesson18.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PhoneRepository extends JpaRepository<Phone, UUID> {
    List<Phone> findAllByNameAndCreationYear(String name, int creationYear);

    List<Phone> findAllById(UUID id);

    List<Phone> findAllByName(String name);

    List<Phone> findAllByCreationYear(int creationYear);
}


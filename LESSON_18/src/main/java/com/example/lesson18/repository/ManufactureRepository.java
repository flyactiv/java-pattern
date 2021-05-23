package com.example.lesson18.repository;

import com.example.lesson18.model.Manufacture;
import com.example.lesson18.model.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ManufactureRepository extends JpaRepository<Manufacture, UUID> {

    List<Manufacture> findAllByNameAndAddress(String name, String address);

    List<Manufacture> getAllById(UUID id);

    List<Manufacture> findAllByName(String name);

    List<Manufacture> findAllByAddress(String address);
}


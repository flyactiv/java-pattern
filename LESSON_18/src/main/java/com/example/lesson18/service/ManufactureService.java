package com.example.lesson18.service;

import com.example.lesson18.model.Manufacture;
import com.example.lesson18.model.Phone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;
import java.util.UUID;

public interface ManufactureService {

    void addManufacture(Manufacture manufacture);

    List<Manufacture> getManufactures();

    List<Manufacture> getManufacture(UUID id);

    void deleteManufacture(Manufacture manufacture);

    void deleteManufacture(UUID id);

    List<Phone> getPhonesByManufacture(UUID manufactureId);

    List<Manufacture> findManufactureByName(String name);

    List<Manufacture> findManufactureByAddress(String address);

}


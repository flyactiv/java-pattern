package com.example.lesson15.service;

import com.example.lesson15.model.Manufacture;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ManufactureService {

    @Autowired
    private final SessionFactory sessionFactory;

    public ManufactureService(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session session;

    @PostConstruct
    public void init() {
        session = sessionFactory.openSession();
    }

    @PreDestroy
    public void unSession() {
        session.close();
    }

    public void addManufacture(Manufacture manufacture) {
        session.beginTransaction();
        session.saveOrUpdate(manufacture);
        session.getTransaction().commit();
    }

    public List<Manufacture> getManufactures() {
        return session.createQuery("select mn from Manufacture mn", Manufacture.class).list();
    }

    public List<Manufacture> getManufacture(UUID id) {
        return session.createQuery("select mn from Manufacture mn where mn.id ='" + id + "'", Manufacture.class).list();
    }

    public void deleteManufacture(Manufacture manufacture) {
        session.beginTransaction();

        List<Manufacture> query = session.createQuery("select mn from Manufacture mn where mn.name = '" +
                manufacture.getName() + "'" + " and mn.address = '" + manufacture.getAddress() + "'", Manufacture.class).list();
        for (Manufacture mn : query) {
            session.delete(mn);
        }

        session.getTransaction().commit();
    }

    public void deleteManufacture(UUID id) {
        session.beginTransaction();

        Manufacture temp = session.load(Manufacture.class, id);
        session.delete(temp);

        session.getTransaction().commit();
    }
}

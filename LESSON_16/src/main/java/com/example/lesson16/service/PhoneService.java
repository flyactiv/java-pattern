package com.example.lesson16.service;

import com.example.lesson16.model.Manufacture;
import com.example.lesson16.model.Phone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.UUID;

@Service
public class PhoneService {

    @Autowired
    private final SessionFactory sessionFactory;

    public PhoneService(SessionFactory sessionFactory) {
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

    public void addPhone(Phone phone) {
        session.beginTransaction();
        session.saveOrUpdate(phone);
        session.getTransaction().commit();
    }

    public List<Phone> getPhones() {
        return session.createQuery("select p from Phone p", Phone.class).list();
    }

    public Phone getPhone(UUID id) {
        return session.createQuery("select p from Phone p where p.id = '" + id + "'", Phone.class).getSingleResult();
    }

    public void deletePhone(UUID id) {

        session.beginTransaction();

        Phone temp = session.load(Phone.class, id);
        session.delete(temp);

        session.getTransaction().commit();
    }

}

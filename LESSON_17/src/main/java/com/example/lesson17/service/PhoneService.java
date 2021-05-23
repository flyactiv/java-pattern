package com.example.lesson17.service;

import com.example.lesson17.model.Manufacture;
import com.example.lesson17.model.Phone;
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
import java.awt.print.Book;
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

    @PersistenceContext
    EntityManager em;

    public List<Phone> findPhonesByName(String name) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Phone> cq = cb.createQuery(Phone.class);

        Root<Phone> phone = cq.from(Phone.class);
        Predicate namePredicate = cb.equal(phone.get("name"), name);
        cq.where(namePredicate);

        TypedQuery<Phone> query = em.createQuery(cq);
        return query.getResultList();
    }

    public List<Phone> findPhonesByCreationYear(int creationYear) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Phone> cq = cb.createQuery(Phone.class);

        Root<Phone> phone = cq.from(Phone.class);
        Predicate creationYearPredicate = cb.equal(phone.get("creationYear"), creationYear);
        cq.where(creationYearPredicate);

        TypedQuery<Phone> query = em.createQuery(cq);
        return query.getResultList();
    }

}

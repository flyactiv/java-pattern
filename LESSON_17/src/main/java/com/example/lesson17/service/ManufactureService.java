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

    public List<Phone> getPhonesByManufacture(UUID manufactureId) {
        return session.createQuery("select m from Manufacture m where m.id = '" + manufactureId.toString() + "'", Manufacture.class)
                .getSingleResult().getPhones();
    }
    @PersistenceContext
    EntityManager em;

    public List<Manufacture> findPhonesByName(String name) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Manufacture> cq = cb.createQuery(Manufacture.class);

        Root<Manufacture> manufacture = cq.from(Manufacture.class);
        Predicate namePredicate = cb.equal(manufacture.get("name"), name);
        cq.where(namePredicate);

        TypedQuery<Manufacture> query = em.createQuery(cq);
        return query.getResultList();
    }

    public List<Manufacture> findPhonesByAddress(String address) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Manufacture> cq = cb.createQuery(Manufacture.class);

        Root<Manufacture> manufacture = cq.from(Manufacture.class);
        Predicate addressPredicate = cb.equal(manufacture.get("address"), address);
        cq.where(addressPredicate);

        TypedQuery<Manufacture> query = em.createQuery(cq);
        return query.getResultList();
    }
}

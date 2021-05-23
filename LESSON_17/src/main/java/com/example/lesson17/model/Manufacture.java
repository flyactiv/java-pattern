package com.example.lesson17.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "manufacture")
public class Manufacture implements Serializable {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "manufacture_id")
    private List<Phone> phones;

    public Manufacture() {
    }

    public Manufacture(String name, String address, List<Phone> phones) {
        this.name = name;
        this.address = address;
        this.phones = phones;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Manufacture)) return false;
        Manufacture that = (Manufacture) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(phones, that.phones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address, phones);
    }
}

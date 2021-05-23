package com.example.lesson16.model;

import com.example.lesson16.service.ManufactureService;
import org.jetbrains.annotations.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "phone")
public class Phone implements Serializable {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "name")
    @NotNull
    private String name;

    @Column(name = "creation_year")
    @NotNull
    private int creationYear;

    public Phone() {
    }

    public Phone(String name, int creationYear, List<Manufacture> manufactures) {
        this.name = name;
        this.creationYear = creationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        this.creationYear = creationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return creationYear == phone.creationYear &&
                Objects.equals(name, phone.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creationYear);
    }

}

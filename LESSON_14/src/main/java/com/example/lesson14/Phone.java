package com.example.lesson14;

import java.util.Objects;

public class Phone {
    private String name;
    private int creationYear;

    public Phone() {
    }

    public Phone(String name, int creationYear) {
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
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return Objects.equals(name, phone.name) && Objects.equals(creationYear, phone.creationYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, creationYear);
    }
}

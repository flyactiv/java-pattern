package com.example.lesson14;

import java.util.Objects;

public class Manufacture {
    private String name;
    private String address;

    public Manufacture() {
    }

    public Manufacture(String name, String address) {
        this.name = name;
        this.address = address;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacture manufacture = (Manufacture) o;
        return Objects.equals(name, manufacture.name) && Objects.equals(address, manufacture.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}

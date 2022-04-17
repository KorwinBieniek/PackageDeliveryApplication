package com.company;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")

public class Address implements Serializable {

    private String city;
    private String street;
    private String postCode;
    private String numberOfBuilding;
    private String numberOfApartment;

    public Address() {
    }

    public Address(String city, String street, String postCode, String numberOfBuilding, String numberOfApartment) {
        this.city = city;
        this.street = street;
        this.postCode = postCode;
        this.numberOfBuilding = numberOfBuilding;
        this.numberOfApartment = numberOfApartment;
    }

    public String getCity() {
        return this.city;
    }

    @Id
    public String getStreet() {
        return this.street;
    }

    public void setCity(String id) {
        this.city = id;
    }

    public void setStreet(String street) {
        this.street = street;
    }


    public String getNumberOfApartment() {
        return numberOfApartment;
    }

    public void setNumberOfApartment(String numberOfApartment) {
        this.numberOfApartment = numberOfApartment;
    }

    public String getNumberOfBuilding() {
        return numberOfBuilding;
    }

    public void setNumberOfBuilding(String numberOfBuilding) {
        this.numberOfBuilding = numberOfBuilding;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}

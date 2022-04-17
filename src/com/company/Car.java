package com.company;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Car")

public class Car implements Serializable {

    private String registrationNumber;
    private String capacity;
    private String brand;
    private String model;
    private String deliveryNumber;

    public Car() {
    }

    public Car(String registrationNumber, String capacity, String brand, String model, String deliveryNumber) {
        this.registrationNumber = registrationNumber;
        this.capacity = capacity;
        this.brand = brand;
        this.model = model;
        this.deliveryNumber = deliveryNumber;
    }

    @Id
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public String getCapacity() {
        return this.capacity;
    }

    public void setRegistrationNumber(String id) {
        this.registrationNumber = id;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }
}

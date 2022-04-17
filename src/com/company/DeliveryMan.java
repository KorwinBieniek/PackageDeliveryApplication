package com.company;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DeliveryMan")

public class DeliveryMan implements Serializable {

    private String name;
    private String surname;
    private String deliveryNumber;
    private String typeOfDelivery;
    private String number;
    private Car deliveryCar;
    private ArrayList<Package> packages;

    public DeliveryMan() {
    }

    public DeliveryMan(String name, String surname, String deliveryNumber, String typeOfDelivery, String number, Car deliveryCar, ArrayList<Package> packages) {
        this.name = name;
        this.surname = surname;
        this.deliveryNumber = deliveryNumber;
        this.typeOfDelivery = typeOfDelivery;
        this.number = number;
        this.deliveryCar = deliveryCar;
        this.packages = packages;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setName(String id) {
        this.name = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public ArrayList<Package> getPackages() {
        return packages;
    }

    public void setPackages(ArrayList<Package> packages) {
        this.packages = packages;
    }

    public Car getDeliveryCar() {
        return deliveryCar;
    }

    public void setDeliveryCar(Car deliveryCar) {
        this.deliveryCar = deliveryCar;
    }

    @Id
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTypeOfDelivery() {
        return typeOfDelivery;
    }

    public void setTypeOfDelivery(String typeOfDelivery) {
        this.typeOfDelivery = typeOfDelivery;
    }

    public String getDeliveryNumber() {
        return deliveryNumber;
    }

    public void setDeliveryNumber(String deliveryNumber) {
        this.deliveryNumber = deliveryNumber;
    }
}

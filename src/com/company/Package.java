package com.company;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Package")

public class Package implements Serializable {

    private String type;
    private Address collectingAddress;
    private Address deliveryAddress;
    private String payment;

    public Package() {
    }

    public Package(String type, Address collectingAddress, Address deliveryAddress, String payment) {
        this.type = type;
        this.collectingAddress = collectingAddress;
        this.deliveryAddress = deliveryAddress;
        this.payment = payment;
    }

    public String getType() {
        return this.type;
    }


    public Address getCollectingAddress() {
        return this.collectingAddress;
    }

    public void setType(String id) {
        this.type = id;
    }

    public void setCollectingAddress(Address collectingAddress) {
        this.collectingAddress = collectingAddress;
    }


    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Id
    public Address getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(Address deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }
}
